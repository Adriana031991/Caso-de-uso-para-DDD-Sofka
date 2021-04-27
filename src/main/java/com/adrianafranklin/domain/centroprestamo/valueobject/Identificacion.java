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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Identificacion that = (Identificacion) o;
        return numDocumento.equals(that.numDocumento) && tipoDocumento.equals(that.tipoDocumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numDocumento, tipoDocumento);
    }
}
