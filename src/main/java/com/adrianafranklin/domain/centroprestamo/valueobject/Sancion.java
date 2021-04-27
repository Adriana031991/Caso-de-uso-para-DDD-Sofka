package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public class Sancion implements ValueObject<String> {
    private final LocalDate fechaSancion;
    private final String descripcionSancion;
    private final String formato;

    public Sancion(int day, int month, int year, String descripcionSancion ) {
        try {
            fechaSancion= LocalDate.of(day,month,year);
            if (fechaSancion.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("La fecha no puede ser antes de hoy: "+ fechaSancion);
            }

        } catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }

        formato = generateFormat();

        this.descripcionSancion= descripcionSancion;
    }
    private String generateFormat(){
        return fechaSancion.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }


    @Override
    public String value() {
        return formato + descripcionSancion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sancion sancion = (Sancion) o;
        return fechaSancion.equals(sancion.fechaSancion) && descripcionSancion.equals(sancion.descripcionSancion) && formato.equals(sancion.formato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaSancion, descripcionSancion, formato);
    }
}
