package com.adrianafranklin.usecase.centroprestamo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.adrianafranklin.domain.centroprestamo.CentroPrestamo;
import com.adrianafranklin.domain.centroprestamo.command.RealizarReserva;
import com.adrianafranklin.domain.centroprestamo.valueobject.CentroPrestamoId;

public class ReservarMasDeDosRecursosPorCategoria extends UseCase<RequestCommand<RealizarReserva>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<RealizarReserva> realizarReservaRequestCommand) {
        var command = realizarReservaRequestCommand.getCommand();
        var centroPrestamo = CentroPrestamo.from(CentroPrestamoId.of(
                command.getCentroPrestamoId().value()), retrieveEvents());
        centroPrestamo.realizarReserva(command.getReservaId(),
                command.getSolicitudId(), command.getTiempoPrestamo(),
                command.getCancelacionReserva(), command.getReservado(),
                command.getPrioridad());

        emit().onResponse(new ResponseEvents(
                centroPrestamo.getUncommittedChanges()
        ));
   }
}
