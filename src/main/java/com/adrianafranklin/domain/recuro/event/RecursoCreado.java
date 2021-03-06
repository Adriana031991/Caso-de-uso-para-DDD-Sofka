package com.adrianafranklin.domain.recuro.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.Inventario;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.RecursoId;

public class RecursoCreado extends DomainEvent {
    private final RecursoId recursoId;
    private final DataRecurso dataRecurso;
    private final Boolean recursoExistente;
    private final CodigoBarra codigoBarra;
    private final Inventario inventario;

    public RecursoCreado(RecursoId recursoId, DataRecurso dataRecurso, Boolean recursoExistente, CodigoBarra codigoBarra, Inventario inventario) {
        super("prestamo.recurso.recursocreado");
        this.recursoId = recursoId;
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

    public RecursoId getRecursoId() {
        return recursoId;
    }
}
