/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TAD;

import java.util.Scanner;

/**
 *
 * @author Zonia Roldan
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
static int radio;
    static Scanner pancho = new Scanner(System.in);
    public static void main(String[] args) {
        
        TAD dell = new TAD ();
        
        System.out.println("Ingrese el radio de su esfera");
        radio = pancho.nextInt();
        dell.resultados();
        -
    }
    
}
