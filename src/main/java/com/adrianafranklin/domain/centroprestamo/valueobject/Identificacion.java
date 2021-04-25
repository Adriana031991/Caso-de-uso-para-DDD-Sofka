package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Identificacion implements ValueObject<String> {
    private String numDocumento;
    private String tipoDocumento;

    public Identificacion(String numDocumento, String tipoDocumento) {
        this.numDocumento = Objects.requireNonNull(numDocumento);
        this.tipoDocumento = Objects.requireNonNull(tipoDocumento);
        if (numDocumento.isBlank() || tipoDocumento.isBlank()){
            throw new IllegalArgumentException("El tipo y numero de documento no pueden estar vacios");
        }
    }
    public String value(){return tipoDocumento+" "+numDocumento;}
}
