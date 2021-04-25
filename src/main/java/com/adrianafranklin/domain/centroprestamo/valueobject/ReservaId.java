package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class ReservaId extends Identity {
    public ReservaId(String uuid) {
        super(uuid);
    }

    public ReservaId() {
    }
    public static ReservaId of(String uuid){
        return new ReservaId();
    }
}
