package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.event.*;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

import java.util.List;
import java.util.Map;

public class CentroPrestamo extends AggregateEvent<CentroPrestamoId> {

    protected Map<SolicitanteId, Solicitante> solicitantes;
    protected Reserva reserva;
    protected Solicitud solicitud;
    protected Map<AdministradorId, Administrador> administradores;
    protected CodigoBarra codigoBarra;

    public CentroPrestamo(CentroPrestamoId entityId, CodigoBarra codigoBarra) {
        super(entityId);
        appendChange(new CentroPrestamoCreado(entityId, codigoBarra)).apply();
    }

    private CentroPrestamo(CentroPrestamoId entityId) {
        super(entityId);
        subscribe(new CentroPrestamoEventChange(this));
    }

    public static CentroPrestamo from(CentroPrestamoId entityId,List<DomainEvent> events){
        var centroPrestamo = new CentroPrestamo(entityId);
        events.forEach(centroPrestamo::applyEvent);
        return centroPrestamo;
    }

    public void agregarAdministrador( Nombre nombre, Identificacion identificacion){
        AdministradorId administradorId = new AdministradorId();
        appendChange(new AdministradorAgregado(administradorId, nombre, identificacion)).apply();
    }

    public void agregarSolicitud(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, SolicitanteId solicitanteId){
        appendChange(new SolicitudAgregada(entityId,descripcionSolicitud,aprobado,tiempoPrestamo, solicitanteId)).apply();
    }

    public void agregarSolicitante(Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado){
        SolicitanteId solicitanteId = new SolicitanteId();
        appendChange(new SolicitanteAgregado(solicitanteId,identificacion,nombre,sancion,bloqueado)).apply();
    }

    public void realizarReserva(ReservaId reservaId, SolicitudId solicitudId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad){
        appendChange(new ReservaRealizada(reservaId,solicitudId,tiempoPrestamo,cancelacionReserva,reservado,prioridad)).apply();
    }


}
