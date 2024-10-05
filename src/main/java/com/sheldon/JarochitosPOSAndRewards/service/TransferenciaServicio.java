package com.sheldon.JarochitosPOSAndRewards.service;

import com.sheldon.JarochitosPOSAndRewards.model.Cliente;
import com.sheldon.JarochitosPOSAndRewards.model.Transferencia;
import com.sheldon.JarochitosPOSAndRewards.repository.TodasLasTransferencias;

import java.util.Date;

public class TransferenciaServicio {
    
    private TodasLasTransferencias repositorioTransferencias ;

    public TransferenciaServicio(TodasLasTransferencias repositorioTransferencias){
        this.repositorioTransferencias = repositorioTransferencias;
    }

    public Long transferirTickets(Cliente clienteOrigen, Cliente clienteDestino, int montoTickets){
        if(clienteOrigen.getTickets() >= montoTickets){
            clienteOrigen.setTickets(clienteOrigen.getTickets() - montoTickets);
            clienteDestino.setTickets(clienteDestino.getTickets() + montoTickets);

            Long id = repositorioTransferencias.crearTransferencia(new Transferencia(null, new Date(), montoTickets, clienteOrigen, clienteDestino));

            return id;
        }
        else System.out.println("No se pudo realizar la transferencia, saldo insuficiente");

        return null;
    }
}
