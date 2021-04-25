package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.*;

public class Solicitante extends Entity<SolicitanteId> {

    protected Identificacion identificacion;
    protected Nombre nombre;
    protected Sancion sancion;
    protected Bloqueado bloqueado;
    protected EstadoSolicitante estadoSolicitante;

    private Solicitante(SolicitanteId solicitanteId) {
        super(solicitanteId);
    }

    public Solicitante(SolicitanteId solicitanteId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado, EstadoSolicitante estadoSolicitante) {
        super(solicitanteId);
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.sancion = sancion;
        this.bloqueado = bloqueado;
        this.estadoSolicitante = estadoSolicitante;
    }

    public static Solicitante from(SolicitanteId solicitanteId, Identificacion identificacion, Nombre nombre, Sancion sancion, Bloqueado bloqueado, EstadoSolicitante estadoSolicitante) {
        var solicitante = new Solicitante(solicitanteId);
        solicitante.nombre= nombre;
        solicitante.identificacion=identificacion;
        solicitante.bloqueado= bloqueado;
        solicitante.sancion=sancion;
        solicitante.estadoSolicitante= estadoSolicitante;
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

    public EstadoSolicitante estadoSolicitante(){
        return estadoSolicitante;
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

    public void updateEstadoSolicitante(EstadoSolicitante estadoSolicitante){
        this.estadoSolicitante= estadoSolicitante;
    }
}
