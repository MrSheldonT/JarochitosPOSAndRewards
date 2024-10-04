package com.sheldon.JarochitosPOSAndRewards.controller;
import java.util.ArrayList;
import java.util.List;

import com.sheldon.JarochitosPOSAndRewards.model.Administrador;
import com.sheldon.JarochitosPOSAndRewards.model.Cuenta;

public class GestorCuentas { // hashmap
    private static List<Cuenta> cuentasRegistradas = new ArrayList<>();

    public static void crearCuenta(Cuenta nuevaCuenta){
        cuentasRegistradas.add(nuevaCuenta) ;
    }

    public static Cuenta buscarCuentaPorCorreo(String correoElectronico){ // how to improve this funtion? Maybe make a binary search
        for(Cuenta cuenta : GestorCuentas.getCuentasRegistradas() )
            if(cuenta.getCorreoElectronico().equals(correoElectronico)) return cuenta;

        return null;
    }

    public static List<Cuenta> getCuentasRegistradas(){
        return cuentasRegistradas;
    }

    public static void editarCuenta(Cuenta cuentaOriginal, Cuenta cuentaOrden, Cuenta cuentaModificada){

        if(cuentaOriginal == null || cuentaModificada == null) {
            System.err.println("Error: Las cuentas no pueden ser nulas.");
            return ;
        }
        if(cuentaOrden instanceof Administrador || cuentaOrden == cuentaOriginal){
            cuentaOriginal.actualizarPerfil(cuentaModificada) ;
            System.out.println("Cuenta actualizada correctamente") ;
        }
        else{
            System.err.println("Solo los administradores y los dueños pueden modificar la cuenta.") ;
        }
    }

    public static boolean eliminarCuenta(Cuenta cuentaEliminada, Cuenta cuentaOrden){
        if (cuentaOrden instanceof Administrador || cuentaOrden.getCorreoElectronico().equals(cuentaEliminada.getCorreoElectronico())) {
            if (cuentasRegistradas.remove(cuentaEliminada)) {
                System.out.println("Cuenta eliminada correctamente.");
                return true;
            } else {
                System.err.println("Error: La cuenta no existe.");
                return false;
            }
        }
        else {
            System.err.println("Error: Solo los administradores o el dueño de la cuenta pueden eliminarla.");
            return false;
        }
    }

}
