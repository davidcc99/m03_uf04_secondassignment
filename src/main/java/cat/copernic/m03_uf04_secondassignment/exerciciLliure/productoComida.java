/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exerciciLliure;

/**
 *
 * @author david
 */
public abstract class productoComida extends item{
    private double calorias;

    public productoComida(double calorias, int idItem, double precio, String nombre, String descripcion) {
        super(idItem, precio, nombre, descripcion);
        this.calorias = calorias;
    }
}