package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.SolicitudId;
import com.adrianafranklin.domain.centroprestamo.valueobject.TiempoPrestamo;
import com.adrianafranklin.domain.recur.Recurso;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

import java.util.Map;

public class SolicitudAgregada extends DomainEvent {
    private final SolicitudId entityId;
    private final String descripcionSolicitud;
    private final Boolean aprobado;
    private final TiempoPrestamo tiempoPrestamo;
    private final Map<RecursoId, Recurso> recursos;

    public SolicitudAgregada(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, Map<RecursoId, Recurso> recursos) {
        super("prestamo.solicitud.agregada");
        this.entityId = entityId;
        this.descripcionSolicitud = descripcionSolicitud;
        this.aprobado = aprobado;
        this.tiempoPrestamo = tiempoPrestamo;
        this.recursos = recursos;
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

    public Map<RecursoId, Recurso> getRecursos() {
        return recursos;
    }
}
