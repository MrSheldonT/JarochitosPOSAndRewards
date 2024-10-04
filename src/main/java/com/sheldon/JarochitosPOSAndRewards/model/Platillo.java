package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.HashMap;
import java.util.Map;

public class Platillo {
    private String nombre ;
    private int ticketsGenerados ;
    private int costoTickets ;
    private int costoMonetario ;
    private Map<Insumo, Integer> insumosNecesarios ;

    Platillo(String nombre, int ticketsGenerados, int costoTickets, int costoMonetario) {
        this.nombre = nombre;
        this.ticketsGenerados = ticketsGenerados;
        this.costoTickets = costoTickets;
        this.insumosNecesarios = new HashMap<>();
        this.costoMonetario = costoMonetario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCostoTickets() {
        return costoTickets;
    }

    public int getTicketsGenerados() {
        return ticketsGenerados;
    }

    public Map<Insumo, Integer> getInsumosNecesarios() {
        return insumosNecesarios;
    }

    public int getCostoMonetario() {
        return costoMonetario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCostoTickets(int costoTickets) {
        this.costoTickets = costoTickets;
    }

    public void setTicketsGenerados(int ticketsGenerados) {
        this.ticketsGenerados = ticketsGenerados;
    }

    public void agregarInsumo(Insumo insumo, Integer cantidadDeUnidad) {
        insumosNecesarios.put(insumo, cantidadDeUnidad);
    }

    public void eliminarInsumo(Insumo insumo) {
        insumosNecesarios.remove(insumo);
    }
    
}
