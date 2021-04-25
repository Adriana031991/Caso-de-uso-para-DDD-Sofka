package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Bloqueado implements ValueObject<String> {

    private final LocalDate fechaBloqueo;
    private final String descripcion;
    private final String formato;

    public Bloqueado(int dd, int mm, int yyyy) {
        try {
            fechaBloqueo = LocalDate.of(dd, mm, yyyy);
            if (fechaBloqueo.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("La fecha no puede ser antes de hoy: "+ fechaBloqueo);
            }
        }catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }
        formato = generateFormat();
        descripcion = descriptionBloqueado();

    }

    public String generateFormat(){
        return fechaBloqueo.format(DateTimeFormatter.ofPattern("dd-mm-yyyy"));
    }

    public String descriptionBloqueado(){
        return this.descripcion;
    }



    @Override
    public String value() {
        return formato+descripcion;
    }
}
