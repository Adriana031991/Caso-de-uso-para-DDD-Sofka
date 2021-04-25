package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class CentroPrestamoId extends Identity {

    private CentroPrestamoId(String uuid) {
        super(uuid);
    }

    public CentroPrestamoId() {
    }

    public CentroPrestamoId of(String uuid) {
        return  new CentroPrestamoId(uuid);
    }

}
