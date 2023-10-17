/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo.pe.com.miempresa;

/**
 *
 * @author ALEXANDER
 */
public class Bucle {
    public static void main(String[] args) {
        String mensaje = "Hola mundo";

        for (int i = 0; i <= 10; i++) { // i++ = i + 1
            System.out.println("i = " + i + " contenido = " + mensaje);
        }
        System.out.println(".......................");
        
        int i = 0;
        
        while (i <= 10) {
            System.out.println("numero = " + i);
            i++;
        }
    }
}
