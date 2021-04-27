package com.adrianafranklin.domain.centroprestamo.valueobject;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Bloqueado implements ValueObject<String> {

    private final LocalDate fechaBloqueo;
    private final String descripcion;
    private final String formato;

    public Bloqueado(int dd, int mm, int yyyy, String descripcion) {
        try {
            fechaBloqueo = LocalDate.of(dd, mm, yyyy);
            if (fechaBloqueo.isBefore(LocalDate.now())){
                throw new IllegalArgumentException("La fecha no puede ser antes de hoy: "+ fechaBloqueo);
            }
        }catch (DateTimeException d){
            throw new IllegalArgumentException(d.getMessage());
        }
        formato = generateFormat();
        this.descripcion= descripcion;

    }

    public String generateFormat(){
        return fechaBloqueo.format(DateTimeFormatter.ofPattern("dd-mm-yyyy"));
    }


    @Override
    public String value() {
        return formato+descripcion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bloqueado bloqueado = (Bloqueado) o;
        return fechaBloqueo.equals(bloqueado.fechaBloqueo) && descripcion.equals(bloqueado.descripcion) && formato.equals(bloqueado.formato);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaBloqueo, descripcion, formato);
    }
}
