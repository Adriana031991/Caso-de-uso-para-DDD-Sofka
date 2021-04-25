package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class AdministradorId extends Identity {
    public AdministradorId(String uuid) {
        super(uuid);
    }

    public AdministradorId(){

    }
    public static AdministradorId of(String uuid){
        return new AdministradorId();
    }
}
