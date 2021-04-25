package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.EventChange;
import com.adrianafranklin.domain.centroprestamo.event.CentroPrestamoCreado;

public class CentroPrestamoEventChange extends EventChange {
    public CentroPrestamoEventChange(CentroPrestamo centroPrestamo) {
        apply((CentroPrestamoCreado event)->{
            centroPrestamo.codigoBarra= event.getCodigoBarra();
        });
    }
}
