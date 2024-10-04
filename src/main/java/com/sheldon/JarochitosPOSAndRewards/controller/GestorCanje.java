package com.sheldon.JarochitosPOSAndRewards.controller;
import java.util.List;

import com.sheldon.JarochitosPOSAndRewards.model.Canje;
import com.sheldon.JarochitosPOSAndRewards.model.Cliente;
import com.sheldon.JarochitosPOSAndRewards.model.Empleado;
import com.sheldon.JarochitosPOSAndRewards.model.EstadoCanje;
import com.sheldon.JarochitosPOSAndRewards.model.Insumo;
import com.sheldon.JarochitosPOSAndRewards.model.Sucursal;

import java.util.Date;

public class GestorCanje {


    public Canje crearCanje(EstadoCanje estado, List<Insumo> insumoCanjeado, Date fecha, Cliente cliente, Empleado empleado, Sucursal sucursal) {

        if (!sucursal.esEmpleadoDeSucursal(empleado)) {
            throw new IllegalArgumentException("El empleado no pertenece a esta sucursal.");
        }
        
        return new Canje(estado, insumoCanjeado, fecha, cliente, empleado, sucursal);
    }

    //deberé mostrar los canjes por sucursal?
}
