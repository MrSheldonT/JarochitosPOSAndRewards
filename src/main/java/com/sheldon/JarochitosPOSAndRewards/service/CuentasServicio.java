package com.sheldon.JarochitosPOSAndRewards.service;

import com.sheldon.JarochitosPOSAndRewards.model.Administrador;
import com.sheldon.JarochitosPOSAndRewards.model.Cuenta;
import com.sheldon.JarochitosPOSAndRewards.repository.TodasLasCuentas;

public class CuentasServicio {
    TodasLasCuentas repositorioCuentas;

    public CuentasServicio(TodasLasCuentas repositorioCuentas){
        this.repositorioCuentas = repositorioCuentas ;
    }

    public Long registrarCuenta(String nombre, String correoElectronico, String contrasenia){

        // to-do -> validation 
        if(correoElectronico.length()>1) return repositorioCuentas.crearCuenta(new Cuenta(null, nombre,correoElectronico, contrasenia)) ;
        return null;
    }

    public boolean editarCuenta(Cuenta cuentaOriginal, Cuenta cuentaModificada, Cuenta cuentaOrden){

        if(cuentaOriginal == null || cuentaModificada == null) {
            System.err.println("Error: Las cuentas no pueden ser nulas.");
            return false ;
        }
        if(cuentaOrden instanceof Administrador || cuentaOrden == cuentaOriginal){
          return repositorioCuentas.editarCuenta(cuentaOriginal, cuentaOrden, cuentaModificada);
        }
        else
        {
            System.err.println("Solo los administradores y los dueños pueden modificar la cuenta.") ;
            return false ;
        }
    }

    public boolean eliminarCuenta(Cuenta cuentaEliminada, Cuenta cuentaOrden){

        if (cuentaOrden instanceof Administrador || cuentaOrden.getCorreoElectronico().equals(cuentaEliminada.getCorreoElectronico())) {
            if (repositorioCuentas.eliminarCuenta(cuentaEliminada)) {
                System.out.println("Cuenta eliminada correctamente."); // try-catch
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
