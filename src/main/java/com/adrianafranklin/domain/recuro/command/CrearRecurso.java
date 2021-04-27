package com.adrianafranklin.domain.recuro.command;

import co.com.sofka.domain.generic.Command;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.Inventario;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.RecursoId;

public class CrearRecurso implements Command {

    private final RecursoId recursoId;
    private final DataRecurso dataRecurso;
    private final Boolean recursoExistente;
    private final CodigoBarra codigoBarra;
    private final Inventario inventario;

    public CrearRecurso(RecursoId recursoId, DataRecurso dataRecurso, Boolean recursoExistente, CodigoBarra codigoBarra, Inventario inventario) {
        this.recursoId = recursoId;
        this.dataRecurso = dataRecurso;
        this.recursoExistente = recursoExistente;
        this.codigoBarra = codigoBarra;
        this.inventario = inventario;
    }

    public RecursoId getRecursoId() {
        return recursoId;
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
