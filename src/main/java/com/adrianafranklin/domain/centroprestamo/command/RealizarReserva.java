package com.adrianafranklin.domain.centroprestamo.command;

import co.com.sofka.domain.generic.Command;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class RealizarReserva implements Command {
    private final CentroPrestamoId centroPrestamoId;
    private final CodigoBarra codigoBarra;
    private final ReservaId reservaId;
    private final SolicitudId solicitudId;
    private final TiempoPrestamo tiempoPrestamo;
    private final CancelacionReserva cancelacionReserva;
    private final Boolean reservado;
    private final Prioridad prioridad;

    public RealizarReserva(CentroPrestamoId centroPrestamoId,
                           CodigoBarra codigoBarra, ReservaId reservaId,
                           SolicitudId solicitudId, TiempoPrestamo tiempoPrestamo,
                           CancelacionReserva cancelacionReserva, Boolean reservado,
                           Prioridad prioridad) {

        this.centroPrestamoId = centroPrestamoId;
        this.codigoBarra = codigoBarra;
        this.reservaId = reservaId;
        this.solicitudId = solicitudId;
        this.tiempoPrestamo = tiempoPrestamo;
        this.cancelacionReserva = cancelacionReserva;
        this.reservado = reservado;
        this.prioridad = prioridad;
    }

    public CentroPrestamoId getCentroPrestamoId() {
        return centroPrestamoId;
    }

    public CodigoBarra getCodigoBarra() {
        return codigoBarra;
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
