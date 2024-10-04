package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Date;
import java.util.Map;


public class Compra {
    private Date fecha ;
    private Map<Insumo, Integer> insumosComprados;
    
    public Compra(Map<Insumo, Integer> insumosComprados, Date fecha){
        this.insumosComprados = insumosComprados ;
    }

    public Date getFecha() {
        return fecha;
    }

    public Map<Insumo, Integer> getInsumosComprados() {
        return insumosComprados;
    }
}
