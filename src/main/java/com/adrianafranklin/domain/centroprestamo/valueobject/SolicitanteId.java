package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class SolicitanteId extends Identity {
    public SolicitanteId(String uuid) {
        super(uuid);
    }

    public SolicitanteId() {
    }
    public static SolicitanteId of(String uuid){
        return new SolicitanteId();
    }
}
