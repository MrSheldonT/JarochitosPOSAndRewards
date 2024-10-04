package com.sheldon.JarochitosPOSAndRewards.controller;
import java.util.ArrayList ;
import java.util.Map;

import com.sheldon.JarochitosPOSAndRewards.model.Cliente;
import com.sheldon.JarochitosPOSAndRewards.model.Compra;
import com.sheldon.JarochitosPOSAndRewards.model.Empleado;
import com.sheldon.JarochitosPOSAndRewards.model.Insumo;
import com.sheldon.JarochitosPOSAndRewards.model.Inventario;
import com.sheldon.JarochitosPOSAndRewards.model.Platillo;
import com.sheldon.JarochitosPOSAndRewards.model.Venta;

import java.util.Date ;

public class GestorVentas{

    private Inventario inventario ;

    public Venta crearVenta(Empleado empleado, Cliente cliente, float costo, Date fecha, ArrayList<Platillo> platillosVendidos){

        int ticketsGenerados = 0 ;
        Double costoTotal = 0d ;
        for (Platillo platillo : platillosVendidos) {
            ticketsGenerados += platillo.getTicketsGenerados() ;
            costoTotal += platillo.getCostoMonetario() ;
            for(Insumo insumo: platillo.getInsumosNecesarios().keySet()){
                Integer unidadVendidad = platillo.getInsumosNecesarios().get(insumo) ;
                if(!inventario.venderInsumo(insumo, unidadVendidad)){
                    System.err.println("No hay suficiente cantidad" + insumo.getNombre() + " para el platillo " + platillo.getNombre());
                    return null ;
                }
                
            }
        }

        return new Venta(empleado, cliente, platillosVendidos, ticketsGenerados, costoTotal);
    }

    public Compra crearCompra(Map<Insumo, Integer> insumosCompra){
        if(insumosCompra == null || insumosCompra.isEmpty()) throw new IllegalArgumentException("La lista de insumos a comprar no es valida");
        
        for(Map.Entry<Insumo, Integer> valorPar : insumosCompra.entrySet()){
            Insumo insumo = valorPar.getKey();
            Integer cantidad = valorPar.getValue();
            inventario.comprarInsumo(insumo, cantidad);
        }
        return new Compra(insumosCompra, new Date());
    }
  
}


   

