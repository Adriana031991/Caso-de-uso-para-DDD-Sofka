package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class Solicitante extends Entity<SolicitanteId> {

    protected Identificacion identificacion;
    protected Nombre nombre;
    protected Sancion sancion;
    protected Bloqueado bloqueado;


    private Solicitante(SolicitanteId entityId) {
        super(entityId);
    }

    protected Solicitante(SolicitanteId entityId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado) {
        super(entityId);
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sancion = sancion;
        this.bloqueado = bloqueado;
    }

    public static Solicitante from(SolicitanteId entityId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado) {
        var solicitante = new Solicitante(entityId);
        solicitante.nombre= nombre;
        solicitante.identificacion=identificacion;
        solicitante.bloqueado= bloqueado;
        solicitante.sancion=sancion;
        return solicitante;
    }

    public String nombre(){
        return nombre.value();
    }

    public String identificacion(){
        return identificacion.value();
    }

    public String sancion(){
        return sancion.value();
    }

    public String bloqueado(){
        return bloqueado.value();
    }

    public void updateNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void updateIdentificacion(Identificacion identificacion){
        this.identificacion =identificacion;
    }

    public void updateSancion(Sancion sancion){
        this.sancion=sancion;
    }

    public void updateBloqueado(Bloqueado bloqueado){
        this.bloqueado= bloqueado;
    }
}
