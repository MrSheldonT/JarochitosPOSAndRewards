package com.sheldon.JarochitosPOSAndRewards.service;

import com.sheldon.JarochitosPOSAndRewards.model.Cliente;
import com.sheldon.JarochitosPOSAndRewards.model.Empleado;
import com.sheldon.JarochitosPOSAndRewards.model.Insumo;
import com.sheldon.JarochitosPOSAndRewards.model.Platillo;
import com.sheldon.JarochitosPOSAndRewards.model.Sucursal;
import com.sheldon.JarochitosPOSAndRewards.model.Venta;
import com.sheldon.JarochitosPOSAndRewards.repository.TodasLasVentas;

import java.util.Map ;

public class VentaServicio {

    private TodasLasVentas repositorioVentas ;

    public VentaServicio(TodasLasVentas repositorioVentas){
        this.repositorioVentas = repositorioVentas ;
    }

    public Long crearVenta(Sucursal sucursal, Empleado empleado, Cliente cliente, Map<Platillo, Integer> platillosVendidos){

        int ticketsGenerados = 0 ;
        double costoTotal = 0d ;

        
        for (Platillo platillo : platillosVendidos.keySet()) {

            ticketsGenerados += platillo.getTicketsGenerados() * platillosVendidos.get(platillo);
            costoTotal += platillo.getCostoMonetario() * platillosVendidos.get(platillo);
        
            for(Insumo insumo: platillo.getInsumosNecesarios().keySet()){
                Integer unidadVendidad = platillo.getInsumosNecesarios().get(insumo) ;
                if(!sucursal.getInventario().venderInsumo(insumo, unidadVendidad)){ // vender pendiente
                    System.err.println("No hay suficiente cantidad" + insumo.getNombre() + " para el platillo " + platillo.getNombre());
                    return null ;
                }
                
            }
            Long id = repositorioVentas.crearVenta(new Venta(null, empleado, cliente, platillosVendidos, ticketsGenerados, costoTotal)) ;
            return id;
        }
      

        return null;
    }
}
