package com.adrianafranklin.domain.centroprestamo;

import co.com.sofka.domain.generic.EventChange;
import com.adrianafranklin.domain.centroprestamo.event.*;
import com.adrianafranklin.domain.centroprestamo.valueobject.EstadoAdministrador;
import com.adrianafranklin.domain.centroprestamo.valueobject.EstadoSolicitante;

public class CentroPrestamoEventChange extends EventChange {
    public CentroPrestamoEventChange(CentroPrestamo centroPrestamo) {
        apply((CentroPrestamoCreado event)->{
            centroPrestamo.codigoBarra= event.getCodigoBarra();
        });
        apply((SolicitudAgregada event)->{
            centroPrestamo.solicitud.descripcionSolicitud= event.getDescripcionSolicitud();
            centroPrestamo.solicitud.tiempoPrestamo = event.getTiempoPrestamo();
            centroPrestamo.solicitud.aprobado= event.getAprobado();
        });
        apply((AdministradorAgregado event)->{
            centroPrestamo.administradores.put(
                    event.getAdministradorId(),
                    new Administrador(event.getAdministradorId(), event.getIdentificacion(),event.getNombre(),
                            EstadoAdministrador.ACTIVO));
        });
        apply((SolicitanteAgregado event)->{
            centroPrestamo.solicitantes.put(
                    event.solicitanteId(),
                    new Solicitante(event.solicitanteId(),event.getIdentificacion(),
                            event.getNombre(), event.getSancion(), event.getBloqueado(),
                            EstadoSolicitante.ACTIVO ));
        });
        apply((ReservaAgregada event)->{
            centroPrestamo.reserva.reservado= event.getReservado();
            centroPrestamo.reserva.solicitudId= event.getSolicitudId();
            centroPrestamo.reserva.cancelacionReserva= event.getCancelacionReserva();
            centroPrestamo.reserva.tiempoPrestamo= event.getTiempoPrestamo();
            centroPrestamo.reserva.prioridad= event.getPrioridad();
        });
    }
}
