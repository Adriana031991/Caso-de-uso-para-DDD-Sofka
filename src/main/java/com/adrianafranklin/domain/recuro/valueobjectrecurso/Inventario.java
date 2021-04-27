package com.adrianafranklin.domain.recuro.valueobjectrecurso;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Inventario implements ValueObject<Integer> {

    private final Integer cantidad;

    public Inventario(Integer cantidad) {
        this.cantidad = Objects.requireNonNull(cantidad);
        if (cantidad == 0) {
            throw new IllegalArgumentException("La cantidad es 0");
        }
    }


    //TODO: preguntar como valido que la cantidad no me de valor negativo. o que si esta en 0, que no permita reservar.
    @Override
    public Integer value() {
        return cantidad;
    }



}
