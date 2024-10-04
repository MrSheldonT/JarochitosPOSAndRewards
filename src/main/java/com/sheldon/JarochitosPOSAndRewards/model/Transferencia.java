package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Date;

public class Transferencia {

    private Date fecha ;
    private int montoTickets ;
    private Cliente clienteOrigen ;
    private Cliente clienteDestino ;

    public Transferencia(Date fecha, int montoTickets, Cliente clienteOrigen, Cliente clienteDestino) {
        this.fecha = fecha;
        this.montoTickets = montoTickets;
        this.clienteOrigen = clienteOrigen;
        this.clienteDestino = clienteDestino;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public int getMontoTickets() {
        return montoTickets;
    }

    public Cliente getClienteDestino() {
        return clienteDestino;
    }

    public Cliente getClienteOrigen() {
        return clienteOrigen;
    }

}
