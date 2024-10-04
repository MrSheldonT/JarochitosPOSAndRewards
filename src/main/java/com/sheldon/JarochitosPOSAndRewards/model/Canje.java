package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.List;
import java.util.Date;

public class Canje {
    private EstadoCanje estado ;
    private List<Insumo> insumosCanjeados ;
    private Date fecha ;
    private Cliente cliente ;
    private Empleado empleado ;
    private Sucursal sucursal ;

    public Canje(EstadoCanje estado, List<Insumo> insumoCanjeado, Date fecha, Cliente cliente, Empleado empleado, Sucursal sucursal) {
        if (insumoCanjeado == null || insumoCanjeado.isEmpty()) throw new IllegalArgumentException("La lista de insumos canjeados no puede estar vacía.");

        this.estado = estado;
        this.fecha = fecha;
        this.insumosCanjeados = List.copyOf(insumoCanjeado);
        this.cliente = cliente;
        this.empleado = empleado;
        this.sucursal = sucursal;
    }


    public List<Insumo> getInsumosCanjeados() {
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

    public void cambiarEstado(EstadoCanje nuevoEstadoCanje){
        this.estado = nuevoEstadoCanje ;
    }

}
