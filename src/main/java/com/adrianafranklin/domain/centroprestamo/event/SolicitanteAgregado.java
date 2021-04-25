package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class SolicitanteAgregado extends DomainEvent {
    private final SolicitanteId entityId;
    private final Identificacion identificacion;
    private final Nombre nombre;
    private final Sancion sancion;
    private final Bloqueado bloqueado;

    public SolicitanteAgregado(SolicitanteId entityId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado) {
        super("prestamo.solicitante.solicitanteAgregado");
        this.entityId = entityId;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sancion = sancion;
        this.bloqueado = bloqueado;
    }

    public SolicitanteId getEntityId() {
        return entityId;
    }

    public Identificacion getIdentificacion() {
        return identificacion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public Bloqueado getBloqueado() {
        return bloqueado;
    }
}
