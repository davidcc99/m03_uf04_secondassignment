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
public class Main {
    public static void main(String[] args) {
        //detalle pizza2 = new detalle(1, 5, new item(1, 2.50, "pizzaPollo", "pizza con trozos pollo")); 
        carritoCompra carro = new carritoCompra();
        
        item pizza1 = new pizzaPollo(150.85, 1, 2.5, "Pizza Pollo Buittoni", "Riquisima pizza de pollo");
        detalle detalle1 = new detalle(1, 5, pizza1);
        
        item armario1 = new armario(2, 450, "Armario ikea", "Armario muy robusto");
        detalle detalle2 = new detalle(2, 2, armario1);
        
        carro.anade(detalle1);
        carro.anade(detalle2);
        carro.checkout();
        carro.elimina(detalle1);
        carro.checkout();
        
        
    }
}
