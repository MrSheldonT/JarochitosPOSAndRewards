package com.sheldon.JarochitosPOSAndRewards.repository;

import java.util.Map;
import com.sheldon.JarochitosPOSAndRewards.model.Venta; 
import java.util.HashMap;

// This metod is called "TodosVentas" is because a advice.
public class TodasLasVentas {
    private Map<Long, Venta> ventas = new HashMap<>();
    private Long idContador = 1L;

    public Long crearVenta(Venta venta){
        Long id = idContador ++ ;
        ventas.put(id, venta) ;
        venta.setId(id);    
        return id ;
    }

    public Map<Long, Venta> obtenerTodasLasVentas(){
        return ventas ;
    }

    public Venta obtenerVentaPorID(Long id){
        try { // Hmmmmmmmmmmmmmmm
            return ventas.get(id) ;
        } catch (Exception e) {
           return null; 
        }
    }
                                          
}
