package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class Reserva extends Entity<ReservaId> {

    protected SolicitudId solicitudId;
    protected TiempoPrestamo tiempoPrestamo;
    protected CancelacionReserva cancelacionReserva;
    protected Boolean reservado;
    protected Prioridad prioridad; // enum
    //TODO--no olvidar usar un contador

    private Reserva(ReservaId reservaId) {
        super(reservaId);
    }

    public Reserva(ReservaId reservaId, SolicitudId solicitudId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        super(reservaId);
        this.solicitudId = solicitudId;
        this.tiempoPrestamo = tiempoPrestamo;
        this.cancelacionReserva = cancelacionReserva;
        this.reservado = reservado;
        this.prioridad = prioridad;
    }

    public static Reserva from(ReservaId entityId, SolicitudId solicitudId, TiempoPrestamo tiempoPrestamo, CancelacionReserva cancelacionReserva, Boolean reservado, Prioridad prioridad) {
        Reserva reserva = new Reserva(entityId);
        reserva.solicitudId = solicitudId;
        reserva.prioridad = prioridad;
        reserva.tiempoPrestamo = tiempoPrestamo;
        reserva.reservado = reservado;
        reserva.cancelacionReserva = cancelacionReserva;
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

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void updatePrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
}
