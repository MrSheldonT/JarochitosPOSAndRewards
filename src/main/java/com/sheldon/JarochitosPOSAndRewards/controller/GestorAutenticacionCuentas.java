package com.sheldon.JarochitosPOSAndRewards.controller;

import com.sheldon.JarochitosPOSAndRewards.model.Cuenta;

public class GestorAutenticacionCuentas {


    public Cuenta login(String correoElectronico, String contrasenia){
        Cuenta cuenta = GestorCuentas.buscarCuentaPorCorreo(correoElectronico);

        if (cuenta.verificarCredenciales(correoElectronico, contrasenia)) {
            return cuenta ;
        }
        return null ;
    }

    public Cuenta logout(){
        return null ;
    }

}
