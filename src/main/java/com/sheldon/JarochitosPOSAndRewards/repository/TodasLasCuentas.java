package com.sheldon.JarochitosPOSAndRewards.repository;

import com.sheldon.JarochitosPOSAndRewards.model.Cuenta;

import java.util.Map;
import java.util.HashMap;

public class TodasLasCuentas {
    private Map<Long, Cuenta> cuentas = new HashMap<>() ;
    private Long idCont = 1L ;

    public Long crearCuenta(Cuenta nuevaCuenta){
        Long id = idCont ++;
        cuentas.put(id, nuevaCuenta) ;
        nuevaCuenta.setId(id) ;

        return id;
    }


    public Cuenta buscarCuentaPorCorreo(String correoElectronico){ 
        for(Long id : cuentas.keySet() ){
            if(cuentas.get(id).getCorreoElectronico().equals(correoElectronico)) return cuentas.get(id);
        }

            
        System.err.println("No se encontró ninguna cuenta con ese correo electronico.");
        return null;
    }

    public Map<Long, Cuenta> getCuentas(){
        return cuentas;
    }

    public boolean editarCuenta(Cuenta cuentaOriginal, Cuenta cuentaOrden, Cuenta cuentaModificada){ // Is there a better option? I don't like this way

        if(cuentas.containsKey(cuentaOriginal.getId())){
            cuentas.put(cuentaOriginal.getId(), cuentaModificada) ;
            return true ;
        }
        System.err.println("Error, no se encontró la cuenta");
        return false;
    }

    public boolean eliminarCuenta(Cuenta cuentaEliminada){
       
        if(cuentas.remove(cuentaEliminada.getId(), cuentaEliminada)) return true;
        System.err.println("Error, no se encontró la cuenta");

        return false;
    }
}
