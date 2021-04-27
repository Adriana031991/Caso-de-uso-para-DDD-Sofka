package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.Entity;
import com.adrianafranklin.domain.centroprestamo.valueobject.SolicitanteId;
import com.adrianafranklin.domain.centroprestamo.valueobject.SolicitudId;
import com.adrianafranklin.domain.centroprestamo.valueobject.TiempoPrestamo;


public class Solicitud extends Entity<SolicitudId> {

    protected String descripcionSolicitud;
    protected Boolean aprobado;
    protected TiempoPrestamo tiempoPrestamo;
    protected SolicitanteId solicitanteId;

    private Solicitud(SolicitudId entityId) {
        super(entityId);
    }


    public static Solicitud from(SolicitudId entityId, String descripcionSolicitud, Boolean aprobado, TiempoPrestamo tiempoPrestamo, SolicitanteId solicitanteId) {
        var solicitud = new Solicitud(entityId);
        solicitud.descripcionSolicitud= descripcionSolicitud;
        solicitud.aprobado= aprobado;
        solicitud.tiempoPrestamo= tiempoPrestamo;
        solicitud.solicitanteId= solicitanteId;


        return solicitud;
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

    public void updateDescripcionSolicitud(String descripcionSolicitud){
        this.descripcionSolicitud=descripcionSolicitud;
    }

    public void updateTiempoPrestamo(TiempoPrestamo tiempoPrestamo){
        this.tiempoPrestamo= tiempoPrestamo;
    }

    public void updateIsAprobado(Boolean aprobado){
        this.aprobado=aprobado;
    }

    public String solicitanteId() {
        return solicitanteId.value();
    }

    public void updateSolicitanteId(SolicitanteId solicitanteId) {
        this.solicitanteId = solicitanteId;
    }
}
