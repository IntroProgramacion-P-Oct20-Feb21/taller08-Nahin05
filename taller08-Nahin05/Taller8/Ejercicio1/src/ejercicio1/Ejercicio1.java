/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "Universidad";
        char letra;
        for (int i = 0; i < palabra.length(); i++){
            letra = palabra.charAt (i);
            for (int x=0; x<=i; x++){
                System.out.printf("%s", letra);
    }
    System.out.println("");
            
        }
    }
}