package com.adrianafranklin.domain.recuro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;
import com.adrianafranklin.domain.recuro.event.CategoriaAgregada;
import com.adrianafranklin.domain.recuro.event.RecursoCreado;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.CategoriaId;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.Inventario;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.RecursoId;

import java.util.List;
import java.util.Map;

public class Recurso extends AggregateEvent<RecursoId> {

    protected Map<CategoriaId, Categoria> categorias;
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

    public static Recurso from(RecursoId recursoId, List<DomainEvent> events){
        Recurso recurso = new Recurso(recursoId);
        events.forEach(recurso::applyEvent);
        return recurso;
    }

    public void agregarCategoria(Nombre nombre, Boolean usoFueraDeLasInstalaciones){
        CategoriaId categoriaId = new CategoriaId();
        appendChange(new CategoriaAgregada(categoriaId,nombre,usoFueraDeLasInstalaciones)).apply();
    }

}
