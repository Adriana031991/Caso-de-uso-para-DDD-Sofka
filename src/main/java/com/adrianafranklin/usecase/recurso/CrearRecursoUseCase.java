package com.adrianafranklin.usecase.recurso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.adrianafranklin.domain.recuro.Recurso;
import com.adrianafranklin.domain.recuro.command.CrearRecurso;

//el requestcommand tiene entrada y respuesta:
public class CrearRecursoUseCase extends UseCase<RequestCommand<CrearRecurso>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearRecurso> crearRecursoRequestCommand) {

       var command = crearRecursoRequestCommand.getCommand();
       var recurso = new Recurso(command.getRecursoId(),
               command.getDataRecurso(), command.getRecursoExistente(),
               command.getCodigoBarra(), command.getInventario());

        emit().onResponse(new ResponseEvents(recurso.getUncommittedChanges()
        ));
    }
}
//getUncommittedChanges = sacamos los eventos de este get. sacamos los cambios que no han sido confirmados
//es decir no han sido persistidos, que no hay un historico de esos datos.