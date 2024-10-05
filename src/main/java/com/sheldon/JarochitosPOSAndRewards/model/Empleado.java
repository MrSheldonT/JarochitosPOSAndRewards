package com.sheldon.JarochitosPOSAndRewards.model;
public class Empleado extends Cuenta {
    
    private char[] RFC = new char[13] ;

    Empleado(Long id, String nombre, String correoElectronico, String contrasenia, int tickets, char[] RFC){
        super(id, nombre, correoElectronico, contrasenia);
        this.RFC = RFC;

        if(RFC.length == 12) this.RFC = RFC.clone();
        else throw new IllegalArgumentException("El RFC es de trece digitos!");
        
    }
    public char[] getRFC() {
        return RFC.clone();
    }

    public void setRFC(char[] RFC) {

        if(RFC.length == 12) this.RFC = RFC.clone();
        else throw new IllegalArgumentException("El RFC es de trece digitos!"); 
    }
}
