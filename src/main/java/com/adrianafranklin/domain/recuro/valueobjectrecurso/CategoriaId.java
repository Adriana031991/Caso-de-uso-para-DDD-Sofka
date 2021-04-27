package com.adrianafranklin.domain.recuro.valueobjectrecurso;

import co.com.sofka.domain.generic.Identity;

public class CategoriaId extends Identity {
    public CategoriaId(String uuid) {
        super(uuid);
    }

    public CategoriaId() {
    }

    public static CategoriaId of() {
        return new CategoriaId();
    }
}
