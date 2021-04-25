package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class SolicitanteAgregado extends DomainEvent {
    private final SolicitanteId solicitanteId;
    private final Identificacion identificacion;
    private final Nombre nombre;
    private final Sancion sancion;
    private final Bloqueado bloqueado;

    public SolicitanteAgregado(SolicitanteId solicitanteId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado) {
        super("prestamo.solicitante.solicitanteAgregado");
        this.solicitanteId = solicitanteId;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sancion = sancion;
        this.bloqueado = bloqueado;
    }

    public SolicitanteId solicitanteId() {
        return solicitanteId;
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
