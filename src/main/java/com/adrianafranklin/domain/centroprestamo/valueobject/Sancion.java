package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Sancion implements ValueObject<String> {
    private final LocalDate fechaSancion;
    private final String descripcionSancion;
    private final String formato;

    public Sancion(int day, int month, int year ) {
        try {
            fechaSancion= LocalDate.of(day,month,year);
            if (fechaSancion.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("La fecha no puede ser antes de hoy: "+ fechaSancion);
            }

        } catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }
        formato = generateFormat();

        descripcionSancion = description();
    }
    private String generateFormat(){
        return fechaSancion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String description(){
        return this.descripcionSancion;
    }

    @Override
    public String value() {
        return formato + descripcionSancion;
    }
}
