package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Map ;
import java.util.Date ;

public class Canje {
    private EstadoCanje estado ;
    private Map<Insumo, Integer> insumosCanjeados ;
    private Date fecha ;
    private Cliente cliente ;
    private Empleado empleado ;
    private Sucursal sucursal ;
    private Long id ;

    public Canje(Long id, EstadoCanje estado, Map<Insumo, Integer> insumoCanjeado, Date fecha, Cliente cliente, Empleado empleado, Sucursal sucursal) {
        if (insumoCanjeado == null || insumoCanjeado.isEmpty()) throw new IllegalArgumentException("La lista de insumos canjeados no puede estar vacía.");
        this.id = id ;
        this.estado = estado;
        this.fecha = fecha;
        this.insumosCanjeados = Map.copyOf(insumoCanjeado);
        this.cliente = cliente;
        this.empleado = empleado;
        this.sucursal = sucursal;
    }


    public Map<Insumo, Integer> getInsumosCanjeados() {
        return insumosCanjeados;
    }

    public EstadoCanje getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public Sucursal getSucursal() {
        return sucursal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void cambiarEstado(EstadoCanje nuevoEstadoCanje){
        this.estado = nuevoEstadoCanje ;
    }

}
