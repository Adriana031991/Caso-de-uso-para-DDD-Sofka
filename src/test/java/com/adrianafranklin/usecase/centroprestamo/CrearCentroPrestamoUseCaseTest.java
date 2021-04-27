package com.adrianafranklin.usecase.centroprestamo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.command.CrearCentroPrestamo;
import com.adrianafranklin.domain.centroprestamo.event.CentroPrestamoCreado;
import com.adrianafranklin.domain.centroprestamo.valueobject.CentroPrestamoId;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CrearCentroPrestamoUseCaseTest {

    @Test
    public void crearNuevoCentroPrestamo(){
        var id = new CentroPrestamoId("b1");
        var codigoBarra = new CodigoBarra(10);
        var command = new CrearCentroPrestamo(id,codigoBarra);

        var useCase = new CrearCentroPrestamoUseCase();

        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().getDomainEvents();
        //este es el evento
        CentroPrestamoCreado event = (CentroPrestamoCreado) events.get(0);

        Assertions.assertEquals(10, event.getCodigoBarra().value());
        Assertions.assertEquals("b1", event.getEntityId().value());
    }

}