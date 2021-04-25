package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

import java.util.List;

public class ReservaAgregada extends DomainEvent {
    private final ReservaId entityId;
    private final SolicitudId solicitudId;
    private final List<RecursoId> recursoId;
    private final TiempoPrestamo tiempoPrestamo;
    private final CancelacionReserva cancelacionReserva;
    private final Boolean reservado;
    private final Prioridad prioridad;

    public ReservaAgregada(ReservaId entityId, SolicitudId solicitudId, List<RecursoId> recursoId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        super("prestamo.reserva.reservaagregada");

        this.entityId = entityId;
        this.solicitudId = solicitudId;
        this.recursoId = recursoId;
        this.tiempoPrestamo = tiempoPrestamo;
        this.cancelacionReserva = cancelacionReserva;
        this.reservado = reservado;
        this.prioridad = prioridad;
    }

    public ReservaId getEntityId() {
        return entityId;
    }

    public SolicitudId getSolicitudId() {
        return solicitudId;
    }

    public List<RecursoId> getRecursoId() {
        return recursoId;
    }

    public TiempoPrestamo getTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public CancelacionReserva getCancelacionReserva() {
        return cancelacionReserva;
    }

    public Boolean getReservado() {
        return reservado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }
}
