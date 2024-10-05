package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Date;
import java.util.Map;

public class Venta {
    private Empleado empleado ;
    private Cliente cliente ;
    private Double costo ;
    private Date fecha ; 
    private Map<Platillo, Integer> platillosVendidos ;
    private int totalTickets ;
    private Long id ;

    public Venta(Long id, Empleado empleado, Cliente cliente, Map<Platillo, Integer> platillosVendidos, int totalTickets, Double costo) {
        this.id = id ;
        this.fecha = new Date();
        this.empleado = empleado;
        this.cliente = cliente;
        this.platillosVendidos = platillosVendidos;
        this.totalTickets = totalTickets ;
        this.costo = costo ;
        
    }

    public Empleado getEmpleado() {
        return empleado;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public Double getCosto() {
        return costo;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Map<Platillo, Integer> getPlatillosVendidos() {
        return platillosVendidos;
    }

    public int getTotalTickets() {
        return totalTickets;
    }
    
}
