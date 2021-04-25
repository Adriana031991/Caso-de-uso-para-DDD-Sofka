package com.adrianafranklin.domain.recur;

import co.com.sofka.domain.generic.EventChange;
import com.adrianafranklin.domain.recur.event.RecursoCreado;

public class RecursoEventChange extends EventChange {
    public RecursoEventChange(Recurso recurso) {
        apply((RecursoCreado event)->{
            recurso.dataRecurso = event.getDataRecurso();
            recurso.codigoBarra = event.getCodigoBarra();
            recurso.inventario = event.getInventario();
            recurso.recursoExistente = event.getRecursoExistente();
        });
    }
}
