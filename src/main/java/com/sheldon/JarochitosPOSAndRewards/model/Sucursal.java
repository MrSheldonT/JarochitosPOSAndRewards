package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.List;
import java.util.ArrayList;
public class Sucursal {
    
    private String nombre ;
    private String ubicacion ;
    private List<Empleado> empleados ;


    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
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
    
}
