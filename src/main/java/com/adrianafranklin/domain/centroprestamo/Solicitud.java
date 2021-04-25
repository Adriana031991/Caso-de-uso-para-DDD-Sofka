package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.SolicitudId;
import com.adrianafranklin.domain.centroprestamo.valueobject.TiempoPrestamo;
import com.adrianafranklin.domain.recur.Recurso;
import com.adrianafranklin.domain.recur.valueobjectrecurso.RecursoId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solicitud extends Entity<SolicitudId> {

    protected String descripcionSolicitud;
    protected Boolean aprobado;
    protected TiempoPrestamo tiempoPrestamo;
    protected Map<RecursoId, Recurso> recursos;

    private Solicitud(SolicitudId entityId) {
        super(entityId);
    }

    protected Solicitud(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, Map<RecursoId, Recurso> recursos) {
        super(entityId);
        this.descripcionSolicitud = descripcionSolicitud;
        this.aprobado = aprobado;
        this.tiempoPrestamo = tiempoPrestamo;
        this.recursos = new HashMap<>();
    }

    public static Solicitud from(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, Map<RecursoId, Recurso> recursos) {
        var solicitud = new Solicitud(entityId);
        solicitud.descripcionSolicitud= descripcionSolicitud;
        solicitud.aprobado= aprobado;
        solicitud.tiempoPrestamo= tiempoPrestamo;
        solicitud.recursos= (Map<RecursoId, Recurso>) recursos;
        return solicitud;
        //TODO- REVISAR SOLICITUD.RECURSOS QUE ESTE BIEN APLICADO.
    }

    public String descripcionSolicitud(){
        return descripcionSolicitud;
    }

    public Boolean isAprobado(){
        return aprobado;
    }

    public String tiempoPrestamo(){
        return tiempoPrestamo.value();
    }

    public Map<RecursoId, Recurso> recursos(){
        return recursos;
    }

    public void updateDescripcionSolicitud(){
        this.descripcionSolicitud=descripcionSolicitud;
    }

    public void updateTiempoPrestamo(){
        this.tiempoPrestamo= tiempoPrestamo;
    }

    public void updateIsAprobado(){
        this.aprobado=aprobado;
    }

    public void updateRecursos(Map<RecursoId, Recurso> recursos) {
        this.recursos = recursos;
    }

}
