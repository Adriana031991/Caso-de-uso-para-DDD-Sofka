package com.adrianafranklin.usecase.recurso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import com.adrianafranklin.domain.centroprestamo.valueobject.CodigoBarra;
import com.adrianafranklin.domain.recuro.command.CrearRecurso;
import com.adrianafranklin.domain.recuro.event.RecursoCreado;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.DataRecurso;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.Inventario;
import com.adrianafranklin.domain.recuro.valueobjectrecurso.RecursoId;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CrearRecursoUseCaseTest {

    @Test
    public void crearNuevoRecurso(){
        var id = new RecursoId("a1");
        var dataRecurso = new DataRecurso("portatil","accer","A001");
        var recursoExistente= true;
        var codigoBarra = new CodigoBarra(98);
        var inventario = new Inventario(5);

        var command = new CrearRecurso(id,dataRecurso,recursoExistente,codigoBarra,inventario);
        var useCase = new CrearRecursoUseCase();

        //add
        List<DomainEvent> events = UseCaseHandler.getInstance().
                syncExecutor(useCase,new RequestCommand<>(command)).
                orElseThrow().
                getDomainEvents();

        //assert
        RecursoCreado event = (RecursoCreado) events.get(0);

        Assertions.assertEquals("portatil accer A001",event.getDataRecurso().value().toString());
        Assertions.assertEquals(98,event.getCodigoBarra().value());
        Assertions.assertEquals(5,event.getInventario().value());
        Assertions.assertEquals(true,event.getRecursoExistente());
        Assertions.assertEquals("a1",event.getRecursoId().value());
    }
}