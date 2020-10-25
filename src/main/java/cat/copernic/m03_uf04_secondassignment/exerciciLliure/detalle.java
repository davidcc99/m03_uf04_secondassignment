/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exerciciLliure;

/**
 *
 * @author david
 * Propiedades item y cantidad
 * 
 * id detalle, Cantidad, item
 */
public class detalle{
    private int idDetalle;
    private int cantidad;
    private item Item;

    public detalle(int idDetalle, int cantidad, item Item) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.Item = Item;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getCantidad() throws Exception{
        if(cantidad<=0) throw new Exception("La cantidad debe ser superior a 0");
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public item getItem() {
        return Item;
    }

    public void setItem(item Item) {
        this.Item = Item;
    }

    @Override
    public String toString() {
        return "detalle{" + "idDetalle=" + idDetalle + ", cantidad=" + cantidad + ", Item=" + Item + '}';
    }
    
}
