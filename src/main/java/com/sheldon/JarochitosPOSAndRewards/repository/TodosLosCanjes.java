package com.sheldon.JarochitosPOSAndRewards.repository;

import java.util.Map;

import com.sheldon.JarochitosPOSAndRewards.model.Canje;

import java.util.HashMap;

public class TodosLosCanjes {
    
    private Map<Long, Canje> canjes = new HashMap<>() ;
    private Long idCont = 1L;

    public Long crearCanje(Canje nuevoCanje){
        Long id = idCont ++;
        canjes.put(id, nuevoCanje);
        nuevoCanje.setId(id);
        return id ;
    }
}
