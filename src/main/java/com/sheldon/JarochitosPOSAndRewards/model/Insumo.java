package com.sheldon.JarochitosPOSAndRewards.model;
public class Insumo {
    private String nombre ;
    private String unidadMedida ;
    private int contenido ;
    private Long id ;

    Insumo(Long id, String nombre, String unidadMedida, int contenido){
        this.id = id ;
        this.nombre = nombre ;
        this.unidadMedida = unidadMedida ;
        this.contenido = contenido ;
    }
    public String getNombre() {
        return nombre;
    }

    public int getContenido() {
        return contenido;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }   

    public Long getId() {
        return id;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
}
