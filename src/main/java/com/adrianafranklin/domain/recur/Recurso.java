package com.adrianafranklin.domain.recur;

import co.com.sofka.domain.generic.AggregateEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.recur.event.RecursoCreado;
import com.adrianafranklin.domain.recur.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recur.valueobjectrecurso.Inventario;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

public class Recurso extends AggregateEvent<RecursoId> {

    protected Categoria categoria;
    protected Boolean recursoExistente;
    protected DataRecurso dataRecurso;
    protected Inventario inventario;
    protected CodigoBarra codigoBarra;

    public Recurso(RecursoId entityId, DataRecurso dataRecurso, Boolean recursoExistente, CodigoBarra codigoBarra, Inventario inventario) {
        super(entityId);
        appendChange(new RecursoCreado(dataRecurso,recursoExistente,codigoBarra,inventario)).apply();
    }

    private Recurso(RecursoId entityId) {
        super(entityId);
        subscribe(new RecursoEventChange(this));
    }


}
