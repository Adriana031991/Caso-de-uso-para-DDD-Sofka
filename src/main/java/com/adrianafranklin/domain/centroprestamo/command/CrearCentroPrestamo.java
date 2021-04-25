package com.adrianafranklin.domain.centroprestamo.command;

import co.com.sofka.domain.generic.Command;
import com.adrianafranklin.domain.centroprestamo.valueobject.CentroPrestamoId;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;

public class CrearCentroPrestamo implements Command {

    private final CentroPrestamoId centroPrestamoId;
    private final CodigoBarra codigoBarra;

    public CrearCentroPrestamo(CentroPrestamoId centroPrestamoId, CodigoBarra codigoBarra) {
        this.centroPrestamoId = centroPrestamoId;
        this.codigoBarra = codigoBarra;
    }

    public CentroPrestamoId getCentroPrestamoId() {
        return centroPrestamoId;
    }

    public CodigoBarra getCodigoBarra() {
        return codigoBarra;
    }
}
