package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Date;
import java.util.List;

public class Venta {
    private Empleado empleado ;
    private Cliente cliente ;
    private Double costo ;
    private Date fecha ; 
    private List<Platillo> platillosVendidos ;
    private int totalTickets ;

    public Venta(Empleado empleado, Cliente cliente, List<Platillo> platillosVendidos, int totalTickets, Double costo) {
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
    
    public List<Platillo> getPlatillosVendidos() {
        return platillosVendidos;
    }

    public int getTotalTickets() {
        return totalTickets;
    }
}
