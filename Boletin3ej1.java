
package boletin3ej1;

import java.util.Scanner;

/**
 *
 * @author Selu
 */
public class Boletin3ej1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int  numero;
        System.out.println("Introduzca un numero (0 para finalizar): ");
        numero = sc.nextInt();
        
        while (numero != 0){
            if (numero % 2 == 0 ){
                System.out.println(numero + "Es par.");
            } else{
                    System.out.println(numero + "es impar");
                   }
            
               
            if(numero > 0) {
                System.out.println("es positivo");
            }else {
                System.out.println("Es negativo");
            }
              
            System.out.println("su cuadrado es: "+ numero * numero);
            
            System.out.println("Introduzca un numero (0 para finalizar): ");
            numero = sc.nextInt();
            
            }
        
        }
        
        
    }
   
