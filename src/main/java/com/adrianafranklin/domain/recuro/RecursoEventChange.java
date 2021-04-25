package com.adrianafranklin.domain.recuro;

import co.com.sofka.domain.generic.EventChange;
import com.adrianafranklin.domain.recuro.event.CategoriaAgregada;
import com.adrianafranklin.domain.recuro.event.RecursoCreado;

public class RecursoEventChange extends EventChange {
    public RecursoEventChange(Recurso recurso) {
        apply((RecursoCreado event)->{
            recurso.dataRecurso = event.getDataRecurso();
            recurso.codigoBarra = event.getCodigoBarra();
            recurso.inventario = event.getInventario();
            recurso.recursoExistente = event.getRecursoExistente();
        });
        //aqui llamo el mapa de categoria y le agrego a cada nueva categoria sus atributos o propiedades(los que estan en la entidad)
        apply((CategoriaAgregada event)->{
            recurso.categorias.put(
                    event.getCategoriaId(),
                    new Categoria(event.getCategoriaId(), event.getNombre(), event.getUsoFueraDeLasInstalaciones()));
        });
    }
}
