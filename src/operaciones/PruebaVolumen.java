/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

public class PruebaVolumen {

    public static void main(String[] args) {
        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        caja1.calcularVolumen();
        
        Caja caja2 = new Caja(3, 2, 6);
        caja2.calcularVolumen();
        
        Caja caja3 = new Caja(4,2,10);
        caja3.calcularVolumen();
    }

}
