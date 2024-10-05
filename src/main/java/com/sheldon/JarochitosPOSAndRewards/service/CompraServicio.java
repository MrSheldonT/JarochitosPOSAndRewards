package com.sheldon.JarochitosPOSAndRewards.service;

import com.sheldon.JarochitosPOSAndRewards.model.Compra;
import com.sheldon.JarochitosPOSAndRewards.model.Cuenta;
import com.sheldon.JarochitosPOSAndRewards.model.Insumo;
import com.sheldon.JarochitosPOSAndRewards.model.Sucursal;
import com.sheldon.JarochitosPOSAndRewards.repository.TodasLasCompras;

import java.util.Date;
import java.util.Map;

public class CompraServicio {
    private TodasLasCompras repositorioCompras ;

    public CompraServicio(TodasLasCompras repositorioCompras){
        this.repositorioCompras = repositorioCompras ;
    }

    //checar que sea perteneciente a la sucursal
    public Long crearCompra(Sucursal sucursal, Cuenta personalSucursal, Map<Insumo, Integer> insumosComprados ){
        
        for (Insumo insumo : insumosComprados.keySet()) {
            sucursal.getInventario().comprarInsumo(insumo, insumosComprados.get(insumo)); // try insumos que no existen
        }

        Long id = repositorioCompras.crearCompra(new Compra(null, insumosComprados, new Date(), personalSucursal));
        return id;
    }
}
