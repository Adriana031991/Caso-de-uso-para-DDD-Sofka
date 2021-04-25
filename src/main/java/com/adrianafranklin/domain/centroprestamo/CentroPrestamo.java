package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.event.*;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;
import com.adrianafranklin.domain.recur.Recurso;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

import java.util.List;
import java.util.Map;

public class CentroPrestamo extends AggregateEvent<CentroPrestamoId> {

    protected Map<SolicitanteId, Solicitante> solicitante;
    protected Reserva reserva;
    protected Solicitud solicitud;
    protected Map<AdministradorId, Administrador> administrador;
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

    public void agregarAdministrador( Nombre nombre, Identificacion identificacion, EstadoAdministrador estadoAdministrador){
        AdministradorId administradorId = new AdministradorId();
        appendChange(new AdministradorAgregado(administradorId, nombre, identificacion, estadoAdministrador)).apply();
    }

    public void agregarSolicitud(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, Map<RecursoId, Recurso> recursos){
        appendChange(new SolicitudAgregada(entityId,descripcionSolicitud,aprobado,tiempoPrestamo,recursos)).apply();
    }
    public void agregarSolicitante(Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado){
        SolicitanteId entityId = new SolicitanteId();
        appendChange(new SolicitanteAgregado(entityId,identificacion,nombre,sancion,bloqueado)).apply();
    }

    public void agregarReserva(ReservaId entityId, SolicitudId solicitudId, List<RecursoId> recursoId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad){
        appendChange(new ReservaAgregada(entityId,solicitudId,recursoId,tiempoPrestamo,cancelacionReserva,reservado,prioridad)).apply();
    }

}
