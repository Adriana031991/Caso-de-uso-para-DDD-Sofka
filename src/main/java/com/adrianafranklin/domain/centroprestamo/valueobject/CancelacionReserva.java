package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CancelacionReserva implements ValueObject<String> {
    private final LocalDate fechaCancelacion;
    private final String descripcionCancelacionReserva;
    private final String formato;


    public CancelacionReserva(int dd, int mm, int yyyy) {
        try {
            fechaCancelacion = LocalDate.of(dd, mm, yyyy);
            if (fechaCancelacion.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("la fecha no puede ser antes de: "+ fechaCancelacion);
            }
        }catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }
        formato = generateFormat();
        descripcionCancelacionReserva = description();
    }
    public String generateFormat(){
        return fechaCancelacion.format(DateTimeFormatter.ofPattern("dd-mm-yyy"));
    }

    public String description() {
        return descripcionCancelacionReserva;
    }

    @Override
    public String value() {
        return formato + descripcionCancelacionReserva;
    }
}
