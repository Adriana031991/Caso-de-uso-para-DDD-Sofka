package com.adrianafranklin.usecase.centroprestamo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.adrianafranklin.domain.centroprestamo.CentroPrestamo;
import com.adrianafranklin.domain.centroprestamo.command.CrearCentroPrestamo;


public class CrearCentroPrestamoUseCase extends UseCase<RequestCommand<CrearCentroPrestamo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearCentroPrestamo> crearCentroPrestamoRequestCommand) {

        var command = crearCentroPrestamoRequestCommand.getCommand();
        var centroPrestamo = new CentroPrestamo(command.getCentroPrestamoId(), command.getCodigoBarra());

        emit().onResponse(new ResponseEvents(
                centroPrestamo.getUncommittedChanges()
        ));
    }
}
