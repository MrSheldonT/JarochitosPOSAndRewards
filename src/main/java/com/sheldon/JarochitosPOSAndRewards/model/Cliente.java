package com.sheldon.JarochitosPOSAndRewards.model;
public class Cliente extends Cuenta {
    
    private int tickets ;

    Cliente(Long id, String nombre, String correoElectronico, String contrasenia, int tickets){
        super(id, nombre, correoElectronico, contrasenia);
        this.tickets = tickets ;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
