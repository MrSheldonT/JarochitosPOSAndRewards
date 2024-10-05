package com.sheldon.JarochitosPOSAndRewards.repository;
import java.util.Map ;
import java.util.HashMap ;

import com.sheldon.JarochitosPOSAndRewards.model.Transferencia;

public class TodasLasTransferencias {
    private Map<Long, Transferencia> transferencias = new HashMap<>() ;
    private Long idContador = 1L;
    
    public Long crearTransferencia(Transferencia transferencia){
        Long id = idContador ++; 
        transferencias.put(id, transferencia) ;
        transferencia.setId(id);

        return id;

    }
}
