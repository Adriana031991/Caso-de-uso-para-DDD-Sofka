package com.adrianafranklin.domain.recuro;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.CategoriaId;

public class Categoria extends Entity<CategoriaId> {

    protected Nombre nombre;
    protected Boolean usoFueraDeLasInstalaciones;

    public Categoria(CategoriaId entityId, Nombre nombre, Boolean usoFueraDeLasInstalaciones) {
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

    public String Nombre() {
        return nombre.value();
    }

    public void updateNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public Boolean usoFueraDeLasInstalaciones() {
        return usoFueraDeLasInstalaciones;
    }

    public void updateUsoFueraDeLasInstalaciones(Boolean usoFueraDeLasInstalaciones) {
        this.usoFueraDeLasInstalaciones = usoFueraDeLasInstalaciones;
    }
}
