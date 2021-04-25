package com.adrianafranklin.domain.recuro.valueobjectrecurso;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class DataRecurso implements ValueObject<String> {

    private final  String nombre;
    private final String marca;
    private final  String referencia;

    public DataRecurso(String nombre, String marca, String referencia) {
        this.nombre = Objects.requireNonNull(nombre);
        this.marca = Objects.requireNonNull(marca);
        this.referencia = Objects.requireNonNull(referencia);

        if (this.nombre.isBlank()||this.marca.isBlank()||this.referencia.isBlank()){
            throw new IllegalArgumentException("El nombre, marca o referencia no puede estar vacio");
        }
    }


    @Override
    public String value() {
        return nombre+" "+marca+" "+referencia;
    }
}
