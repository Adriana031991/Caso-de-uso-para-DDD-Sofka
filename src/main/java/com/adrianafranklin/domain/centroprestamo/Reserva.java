package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

import java.util.List;

public class Reserva extends Entity<ReservaId> {

    protected SolicitudId solicitudId;
    protected List<RecursoId> recursoId;
    protected TiempoPrestamo tiempoPrestamo;
    protected CancelacionReserva cancelacionReserva;
    protected Boolean reservado;
    protected Prioridad prioridad; // enum
    //no olvidar usar un contador


    private Reserva(ReservaId entityId) {
        super(entityId);
    }

    protected Reserva(ReservaId entityId, SolicitudId solicitudId, List<RecursoId> recursoId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        super(entityId);
        this.solicitudId = solicitudId;
        this.recursoId = recursoId;
        this.tiempoPrestamo = tiempoPrestamo;
        this.cancelacionReserva = cancelacionReserva;
        this.reservado = reservado;
        this.prioridad = prioridad;
    }

    public static Reserva from(ReservaId entityId, SolicitudId solicitudId, List<RecursoId> recursoId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        Reserva reserva = new Reserva(entityId);
        reserva.solicitudId=solicitudId;
        reserva.prioridad=prioridad;
        reserva.recursoId= recursoId;
        reserva.tiempoPrestamo= tiempoPrestamo;
        reserva.reservado= reservado;
        reserva.cancelacionReserva=cancelacionReserva;
        return reserva;
    }

    public String SolicitudId() {
        return solicitudId.value();
    }

    public void updateSolicitudId(SolicitudId solicitudId) {
        this.solicitudId = solicitudId;
    }


    public String TiempoPrestamo() {
        return tiempoPrestamo.value();
    }

    public void updateTiempoPrestamo(TiempoPrestamo tiempoPrestamo) {
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public String CancelacionReserva() {
        return cancelacionReserva.value();
    }

    public void updateCancelacionReserva(CancelacionReserva cancelacionReserva) {
        this.cancelacionReserva = cancelacionReserva;
    }

    public Boolean isReservado() {
        return reservado;
    }

    public void updateReservado(Boolean reservado) {
        this.reservado = reservado;
    }

    //TODO---VALIDAR ESTE ENUM y lista de recurso
    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void updatePrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public List<RecursoId> getRecursoId() {
        return recursoId;
    }

    public void setRecursoId(List<RecursoId> recursoId) {
        this.recursoId = recursoId;
    }
}
