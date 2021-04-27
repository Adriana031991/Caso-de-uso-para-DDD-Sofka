package com.adrianafranklin.domain.recuro.valueobjectrecurso;

import co.com.sofka.domain.generic.Identity;

public class RecursoId extends Identity {
    public RecursoId(String uuid) {
        super(uuid);
    }

    public RecursoId() {
    }

    public static RecursoId of(String uuid) {
        return new RecursoId();
    }
}
