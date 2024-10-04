package com.sheldon.JarochitosPOSAndRewards.controller;
import java.util.Date;

import com.sheldon.JarochitosPOSAndRewards.model.Cliente;
import com.sheldon.JarochitosPOSAndRewards.model.Transferencia;

public class GestorTransferencias {
    public Transferencia transferirTickets(Cliente clienteOrigen, Cliente clienteDestino, int montoTickets){

        if(clienteOrigen.getTickets() >= montoTickets){
            clienteOrigen.setTickets(clienteOrigen.getTickets() - montoTickets);
            clienteDestino.setTickets(clienteDestino.getTickets() + montoTickets);

            Transferencia nuevaTransferencia = new Transferencia(new Date(), montoTickets, clienteOrigen, clienteDestino) ;

            return nuevaTransferencia;
        }
        else System.out.println("No se pudo realizar la transferencia, saldo insuficiente");

        return null;
    }
}
