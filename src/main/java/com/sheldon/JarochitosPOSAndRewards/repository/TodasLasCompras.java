package com.sheldon.JarochitosPOSAndRewards.repository;

import java.util.Map ;

import com.sheldon.JarochitosPOSAndRewards.model.Compra;

import java.util.HashMap ;

public class TodasLasCompras {
    public Map<Long, Compra> compras = new HashMap<>() ;
    private Long idContador = 1L ;

    public Long crearCompra(Compra compra){
        Long id = idContador ++;
        compras.put(id, compra);
        compra.setId(id);

        return id;
    }

    public Map<Long, Compra> obtenerTodasLasCompras(){
        return compras ;
    }
    
    public Compra obtenerVentaPorID(Long id){
        try { // Hmmmmmmmmmmmmmmm
            return compras.get(id) ;
        } catch (Exception e) {
           return null; 
        }
    }
    
}


