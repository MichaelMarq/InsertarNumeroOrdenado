
package insertarnumeroordenado;

import java.util.Scanner;

/**
 *
 * @author TRAVE
 */
public class InsertarNumeroOrdenado {

   
    public static void main(String[] args) {
        
        
        int numero[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingresa un numero: ");
            numero[i] = entrada.nextInt();
        }
        
        System.out.println("");
        int cantidad;
        
                
        System.out.print("Digite un numero: ");
        cantidad = entrada.nextInt();
        
        for (int i = 3; i >= 0; i--) {
            
            if(cantidad <= numero[i]){             
                numero[i+1] = numero[i];
            }
            else{
                numero[i+1] = cantidad;
                break;//funciona para salir del bucle, para forzarlo a finalizar el bucle
                //cantidad = numero[i];
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(i+".  "+numero[i]);
        }
        
    }
    
}
