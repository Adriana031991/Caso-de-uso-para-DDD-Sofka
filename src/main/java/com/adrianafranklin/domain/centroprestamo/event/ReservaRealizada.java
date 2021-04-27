package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class ReservaRealizada extends DomainEvent {
    private final ReservaId reservaId;
    private final SolicitudId solicitudId;
    private final TiempoPrestamo tiempoPrestamo;
    private final CancelacionReserva cancelacionReserva;
    private final Boolean reservado;
    private final Prioridad prioridad;

    public ReservaRealizada(ReservaId reservaId, SolicitudId solicitudId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        super("prestamo.reserva.reservaagregada");

        this.reservaId = reservaId;
        this.solicitudId = solicitudId;
        this.tiempoPrestamo = tiempoPrestamo;
        this.cancelacionReserva = cancelacionReserva;
        this.reservado = reservado;
        this.prioridad = prioridad;
    }


    public ReservaId getReservaId() {
        return reservaId;
    }

    public SolicitudId getSolicitudId() {
        return solicitudId;
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
