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
public class TerminalVenta extends Sobremesa{

    public TerminalVenta(String nombre, String descripcion, double precio) throws Exception {
        super(nombre, descripcion, precio);
    }
    
    @Override
    public void conecta() {
        System.out.println("Conectando Terminal Venta");
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando Terminal Venta");
    } 
    
}
