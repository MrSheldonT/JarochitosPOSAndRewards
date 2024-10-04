package com.sheldon.JarochitosPOSAndRewards.model;
public class Cliente extends Cuenta {
    
    private int tickets ;

    Cliente(String nombre, String correoElectronico, String contrasenia, int tickets){
        super(nombre, correoElectronico, contrasenia);
        this.tickets = tickets ;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
