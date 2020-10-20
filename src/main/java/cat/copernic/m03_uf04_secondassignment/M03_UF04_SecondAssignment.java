/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {
    
    public static void main(String[] args) throws Exception {
        Mobiles Tablet1 = new Tablet("Ipad Pro","Gran capacidad de almacenamiento y buena calidad",400.5);
        try {
        Tablet1.conecta();
        Tablet1.desconecta();
        Tablet1.reset();
        System.out.println(Tablet1 instanceof Tablet);
        }
        
        catch (Exception e){
            e.printStackTrace();
        }
        
        Dispositivos PC1 = new Ordenador("Asus Legion","PC GAMING",999.99);
        try {
        PC1.conecta();
        PC1.desconecta();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
