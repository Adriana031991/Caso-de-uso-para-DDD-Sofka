package com.adrianafranklin.domain.recur.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.recur.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recur.valueobjectrecurso.Inventario;

public class RecursoCreado extends DomainEvent {
    private final DataRecurso dataRecurso;
    private final Boolean recursoExistente;
    private final CodigoBarra codigoBarra;
    private final Inventario inventario;

    public RecursoCreado(DataRecurso dataRecurso, Boolean recursoExistente, CodigoBarra codigoBarra, Inventario inventario) {
        super("prestamo.recurso.recursocreado");
        this.dataRecurso = dataRecurso;
        this.recursoExistente = recursoExistente;
        this.codigoBarra = codigoBarra;
        this.inventario = inventario;
    }

    public DataRecurso getDataRecurso() {
        return dataRecurso;
    }

    public Boolean getRecursoExistente() {
        return recursoExistente;
    }

    public CodigoBarra getCodigoBarra() {
        return codigoBarra;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
