/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment.exerciciLliure;

/**
 *
 * @author david
 * Producte que volem comprar
 * 
 * id item, precio, descripcion, nombre
 * 
 * Posible item abstracto y hacer sub clases de categorias
 * Se recomienda extender esta clase
 */
public abstract class item{
    private int idItem;
    private double precio;
    private String nombre;
    private String descripcion;

    public item(int idItem, double precio, String nombre, String descripcion) {
        this.idItem = idItem;
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public double getPrecio() throws Exception {
        if(precio<=0) throw new Exception("El precio debe ser superior a 0");
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "item{" + "idItem=" + idItem + ", precio=" + precio + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
}
