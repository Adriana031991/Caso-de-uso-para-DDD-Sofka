package com.adrianafranklin.domain.recuro.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.CategoriaId;

public class CategoriaAgregada extends DomainEvent {
    private final CategoriaId categoriaId;
    private final Nombre nombre;
    private final Boolean usoFueraDeLasInstalaciones;

    public CategoriaAgregada(CategoriaId categoriaId, Nombre nombre, Boolean usoFueraDeLasInstalaciones) {
        super("prestamo.categoria.categoriaagregada");
        this.categoriaId = categoriaId;
        this.nombre = nombre;
        this.usoFueraDeLasInstalaciones = usoFueraDeLasInstalaciones;
    }

    public CategoriaId getCategoriaId() {
        return categoriaId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Boolean getUsoFueraDeLasInstalaciones() {
        return usoFueraDeLasInstalaciones;
    }
}
