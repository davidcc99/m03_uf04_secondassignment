/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author david
 */
public class Tablet extends Mobiles{

    public Tablet(String nombre, String descripcion, double precio) {
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void reset() {
        //Comportamiento común para todos los yates
        System.out.println("Reseteando tablet");
    }
    
}
