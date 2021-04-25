package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.SolicitudId;
import com.adrianafranklin.domain.centroprestamo.valueobject.TiempoPrestamo;

public class SolicitudAgregada extends DomainEvent {
    private final SolicitudId entityId;
    private final String descripcionSolicitud;
    private final Boolean aprobado;
    private final TiempoPrestamo tiempoPrestamo;

    public SolicitudAgregada(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo) {
        super("prestamo.solicitud.agregada");
        this.entityId = entityId;
        this.descripcionSolicitud = descripcionSolicitud;
        this.aprobado = aprobado;
        this.tiempoPrestamo = tiempoPrestamo;
    }

    public SolicitudId getEntityId() {
        return entityId;
    }

    public String getDescripcionSolicitud() {
        return descripcionSolicitud;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public TiempoPrestamo getTiempoPrestamo() {
        return tiempoPrestamo;
    }

}
