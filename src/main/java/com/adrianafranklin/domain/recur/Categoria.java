package com.adrianafranklin.domain.recur;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;
import com.adrianafranklin.domain.recur.valueobjectrecurso.CategoriaId;

public class Categoria extends Entity<CategoriaId> {

    protected Nombre nombre;
    protected Boolean usoFueraDeLasInstalaciones;

    protected Categoria(CategoriaId entityId, Nombre nombre, Boolean usoFueraDeLasInstalaciones) {
        super(entityId);
        this.nombre = nombre;
        this.usoFueraDeLasInstalaciones = usoFueraDeLasInstalaciones;
    }

    private Categoria(CategoriaId entityId) {
        super(entityId);
    }

    public static Categoria from(CategoriaId entityId,Nombre nombre, Boolean usoFueraDeLasInstalaciones) {
        Categoria categoria = new Categoria(entityId);
        categoria.nombre = nombre;
        categoria.usoFueraDeLasInstalaciones = usoFueraDeLasInstalaciones;
        return categoria;
    }
}
