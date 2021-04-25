package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class SolicitudId extends Identity {
    public SolicitudId(String uuid) {
        super(uuid);
    }

    public SolicitudId() {
    }

    public static SolicitudId of(String uuid){
        return new SolicitudId();
    }
}
