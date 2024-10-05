package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.Date;
import java.util.Map;


public class Compra {
    private Date fecha ;
    private Map<Insumo, Integer> insumosComprados ;
    private Cuenta personalSuministrador ;
    private Long id ;

    
    public Compra(Long id, Map<Insumo, Integer> insumosComprados, Date fecha, Cuenta personalSuministrador){
        this.id = id;
        this.insumosComprados = insumosComprados ;
        if(personalSuministrador instanceof Administrador || personalSuministrador instanceof Empleado)
            this.personalSuministrador = personalSuministrador ;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cuenta getPersonalSuministrador() {
        return personalSuministrador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Map<Insumo, Integer> getInsumosComprados() {
        return insumosComprados;
    }
}
