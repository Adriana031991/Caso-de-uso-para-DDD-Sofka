package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.Identity;

public class CentroPrestamoId extends Identity {

    public CentroPrestamoId(String uuid) {
        super(uuid);
    }

    public CentroPrestamoId() {
    }


    public static CentroPrestamoId of(String uuid) {
        return  new CentroPrestamoId(uuid);
    }

}
