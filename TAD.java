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
public class TAD extends NewMain {
   static Scanner sc = new Scanner(System.in);

    public TAD() {
    }
    
    public TAD(int radio) {
    }
   
        
        public void resultados(){
            System.out.println("El área es: \n");
            operacion_area();
            
            System.out.println("El diametro es: \n");
            System.out.println(radio*2);
            
            System.out.println("La circunferencia es: \n");
            operacion_circunferencia();
            
            System.out.println("El volumen es: \n");
            operacion_volumen();
        }
        public void operacion_area(){
            Double area = 4* Math.PI *(radio*radio);
            System.out.println(area);
    }

        public void operacion_circunferencia (){
            Double circunferencia = Math.PI *(radio*2);
            System.out.println(circunferencia);
        }
        
        public void operacion_volumen(){
            Double volumen = (4/3)* Math.PI * Math.pow(radio, radio);
            System.out.println(volumen);
        } 
}
