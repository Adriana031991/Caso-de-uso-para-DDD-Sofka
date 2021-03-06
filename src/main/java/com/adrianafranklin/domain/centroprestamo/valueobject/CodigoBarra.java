package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class CodigoBarra implements ValueObject<Integer> {

    private final Integer codigo;

    public CodigoBarra(Integer codigo) {
        this.codigo = Objects.requireNonNull(codigo);
        if (codigo==0){
            throw new IllegalArgumentException("El codigo  no puede ser cero 0");
        }
    }

    @Override
    public Integer value() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CodigoBarra that = (CodigoBarra) o;
        return codigo.equals(that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
