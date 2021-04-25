package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CentroPrestamoId;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;

public class CentroPrestamoCreado extends DomainEvent {
    private final CentroPrestamoId entityId;
    private final CodigoBarra codigoBarra;

    public CentroPrestamoCreado(CentroPrestamoId entityId, CodigoBarra codigoBarra) {
        super("prestamo.centroprestamo.creado");//va: elproblema.elnombredelagregado.elevento
        this.entityId = entityId;
        this.codigoBarra = codigoBarra;
    }

    public CentroPrestamoId getEntityId() {
        return entityId;
    }

    public CodigoBarra getCodigoBarra() {
        return codigoBarra;
    }
}
