package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class CancelacionReserva implements ValueObject<String> {
    private final LocalDate fechaCancelacion;
    private final String descripcionCancelacionReserva;
    private final String formato;


    public CancelacionReserva(int dd, int mm, int yyyy, String descripcionCancelacionReserva) {
        try {
            fechaCancelacion = LocalDate.of(dd, mm, yyyy);
            if (fechaCancelacion.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("la fecha no puede ser antes de: "+ fechaCancelacion);
            }
        }catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }
        formato = generateFormat();
        this.descripcionCancelacionReserva= descripcionCancelacionReserva;
    }
    public String generateFormat(){
        return fechaCancelacion.format(DateTimeFormatter.ofPattern("dd-mm-yyy"));
    }


    @Override
    public String value() {
        return formato + descripcionCancelacionReserva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CancelacionReserva that = (CancelacionReserva) o;
        return fechaCancelacion.equals(that.fechaCancelacion) && descripcionCancelacionReserva.equals(that.descripcionCancelacionReserva) && formato.equals(that.formato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaCancelacion, descripcionCancelacionReserva, formato);
    }
}
