/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exerciciLliure;

import java.util.ArrayList;

/**
 *
 * @author david
 * 
 * Implemente un ejercicio original con:
 * 
 * Herencia
 * Polimorfismo
 * Interfaces
 * Propiedades, etc...
 * 
 * Fecha Domingo 25 24:00
 * 
 */
public class carritoCompra implements Finalizable {

    private ArrayList<detalle> carrito = new ArrayList<>();
    
    
    public void anade(detalle detalle){
        carrito.add(detalle);
        System.out.println("Numero total detalles " + carrito.size());
    }
    
    public void elimina(detalle detalle){
        carrito.remove(detalle);
        System.out.println("Numero total detalles: " + carrito.size());
    }
    
    @Override
    public double checkout() { //precio total compra
        double total = 0.0;
        double precio = 0;
        int cantidad = 0;
        
        for(int i = 0;i<carrito.size();i++){
            try {
                cantidad = carrito.get(i).getCantidad();
            } catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("El numero total de items del detalle" + carrito.get(i).getIdDetalle() + " es " + cantidad + " items");
            try {
                precio = carrito.get(i).getItem().getPrecio();
            } catch (Exception e){
                e.printStackTrace();
            }
            total += (cantidad*precio);
        }
        System.out.println("El precio total del carrito es " + total + " euros");
        return total;
    }
    
    
    
}
