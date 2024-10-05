package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.List;

import com.sheldon.JarochitosPOSAndRewards.repository.TodoElInventario;

import java.util.ArrayList;
public class Sucursal {
    
    private String nombre ;
    private String ubicacion ;
    private List<Empleado> empleados ;
    private TodoElInventario inventario ;
    private Long id ;

    Sucursal(Long id, String nombre, String ubicacion){
        this.id = id ;
        this.nombre = nombre ;
        this.ubicacion = ubicacion;
        this.inventario = new TodoElInventario() ;
        this.empleados = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public Long getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public boolean esEmpleadoDeSucursal(Empleado empleado){
        return empleados.contains(empleado);
    }

    public List<Empleado> getEmpleados(){
        return new ArrayList<>(empleados);
    }

    public TodoElInventario getInventario() {
        return inventario;
    }
    
}
