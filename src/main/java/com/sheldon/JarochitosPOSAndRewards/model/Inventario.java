package com.sheldon.JarochitosPOSAndRewards.model;
import java.util.HashMap ;
import java.util.Map;
public class Inventario {
    private Map<Insumo, Integer> stock ;

    public Inventario(){
        this.stock = new HashMap<>() ;
    }

    public void agregarInsumo(Insumo insumo, int cantidad){
        if(stock.containsKey(insumo)){
            int cantidadExistente =stock.get(insumo);
            stock.put(insumo, cantidadExistente + cantidad);
        }
        else stock.put(insumo, 0);

    }
    public boolean venderInsumo(Insumo insumo, Integer cantidadDeInsumo){
        if (stock.containsKey(insumo)) {
            int cantidadExistente = stock.get(insumo);
            if (cantidadExistente >= cantidadDeInsumo) {
                stock.put(insumo, cantidadExistente - cantidadDeInsumo );
                return true; 
            } else {
                
                System.out.println("No hay suficiente cantidad de " + insumo.getNombre() + " en inventario.");
                return false; 
            }
        } else {
            System.out.println("El insumo " + insumo.getNombre() + " no existe en el inventario.");
            return false; 
        }
    }

    public void comprarInsumo(Insumo insumo, int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a comprar debe ser mayor que cero.");
        }
        agregarInsumo(insumo, cantidad); 
        System.out.println("Se han comprado " + cantidad + " de " + insumo.getNombre());
    }

    public void mostrarInventario() {
        System.out.println("Inventario:");
        for (Map.Entry<Insumo, Integer> entry : stock.entrySet()) {
            Insumo insumo = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println(insumo + ", cantidad=" + cantidad);
        }
    }
}
