package com.adrianafranklin.domain.centroprestamo.event;

import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.AdministradorId;
import com.adrianafranklin.domain.centroprestamo.valueobject.EstadoAdministrador;
import com.adrianafranklin.domain.centroprestamo.valueobject.Identificacion;
import com.adrianafranklin.domain.centroprestamo.valueobject.Nombre;

public class AdministradorAgregado extends DomainEvent {

    private final AdministradorId administradorId;
    private final Nombre nombre;
    private final Identificacion identificacion;
    private final EstadoAdministrador estadoAdministrador;

    public AdministradorAgregado(AdministradorId administradorId, Nombre nombre, Identificacion identificacion, EstadoAdministrador estadoAdministrador) {
        super("prestamo.administrador.agregado");
        this.administradorId= administradorId;
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.estadoAdministrador = estadoAdministrador;
    }

    public AdministradorId getAdministradorId() {
        return administradorId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public EstadoAdministrador getEstadoAdministrador() {
        return estadoAdministrador;
    }
}
