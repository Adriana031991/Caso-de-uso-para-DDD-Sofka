package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class TiempoPrestamo implements ValueObject<String> {
    private final LocalDateTime fechaYHoraPrestamo;
    private final String formato;

    public TiempoPrestamo(int year, int month, int day, int HH, int mm, int ss) {

        try {
            fechaYHoraPrestamo = LocalDateTime.of(year, month, day, HH, mm, ss);
            if(fechaYHoraPrestamo.isBefore(LocalDateTime.now())){
                throw new IllegalArgumentException("La fecha no puede ser antes de hoy: "+ fechaYHoraPrestamo);
            }
        } catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
        formato = generateFormat();
    }
    private String generateFormat(){
        return fechaYHoraPrestamo.format(DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss"));
    }

    @Override
    public String value() {
        return formato;
    }

/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TiempoPrestamo that = (TiempoPrestamo) o;
        return fechaYHoraPrestamo.equals(that.fechaYHoraPrestamo) && formato.equals(that.formato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaYHoraPrestamo, formato);
    }

 */
}
