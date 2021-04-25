package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.AdministradorId;
import com.adrianafranklin.domain.centroprestamo.valueobject.EstadoAdministrador;
import com.adrianafranklin.domain.centroprestamo.valueobject.Identificacion;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;

public class Administrador extends Entity <AdministradorId>{

    protected Identificacion identificacion;
    protected Nombre nombre;
    protected EstadoAdministrador estadoAdministrador;


    protected Administrador(AdministradorId entityId, Identificacion identificacion,Nombre nombre,EstadoAdministrador estadoAdministrador ) {
        super(entityId);
        this.identificacion= identificacion;
        this.nombre = nombre;
        this.estadoAdministrador = estadoAdministrador;

    }

    private Administrador(AdministradorId entityId){
        super(entityId);
    }

    public static Administrador from(AdministradorId entityId, Identificacion identificacion,Nombre nombre,EstadoAdministrador estadoAdministrador){
        var administrador = new Administrador(entityId);
        administrador.nombre=nombre;
        administrador.identificacion=identificacion;
        administrador.estadoAdministrador=estadoAdministrador;
        return  administrador;
    }

    public String nombre(){
        return nombre.value();
    }

    public String identificacion(){
        return identificacion.value();
    }
//TODO--ARREGLAR EL LLAMADO DEL ENUM
    public EstadoAdministrador estadoAdministrador(){
        return estadoAdministrador;
    }

    public void updateNombre(Nombre nombre){
        this.nombre = nombre;
    }
    public void updateIdentificacion(Identificacion identificacion){
        this.identificacion = identificacion;
    }

    public void updateEstadoAdministrador(){
        this.estadoAdministrador=estadoAdministrador;
    }

}
