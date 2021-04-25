package com.adrianafranklin.usecase.centroprestamo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.CentroPrestamo;
import com.adrianafranklin.domain.centroprestamo.command.CrearCentroPrestamo;
import com.adrianafranklin.domain.centroprestamo.event.CentroPrestamoCreado;
import com.adrianafranklin.domain.centroprestamo.valueobject.CentroPrestamoId;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrearCentroPrestamoUseCaseTest {

    @Test
    void crearNuevoCentroPrestamo(){
        var id = new CentroPrestamoId();
        var codigoBarra = new CodigoBarra(10);
        var command = new CrearCentroPrestamo(id,codigoBarra);

        var useCase = new CrearCentroPrestamoUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().getDomainEvents();
        //este es el evento
        CentroPrestamoCreado event = (CentroPrestamoCreado) events.get(0);

        Assertions.assertEquals(10, event.getCodigoBarra().value());
    }

}