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
public abstract class Mobiles extends Dispositivos {

    public Mobiles(String nombre, String descripcion, double precio) throws Exception {
        super(nombre, descripcion, precio);
    }
    
    abstract void reset();
    
}
