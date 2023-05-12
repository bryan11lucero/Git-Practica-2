/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenainvertida;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class CadenaInvertida {

    /**
     * @param args El codigo principal dara una cadena y dara un resultado
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < casos; i++) {
            String original = sc.nextLine();
            String invertida = invertirCadena(original);
            System.out.println(invertida);
        }
        
    }
    /**
     * 
     * @param original
     * @return devolvera una cadena invertida
     */
    public static String invertirCadena(String original) {
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        return invertida;
    }
}
