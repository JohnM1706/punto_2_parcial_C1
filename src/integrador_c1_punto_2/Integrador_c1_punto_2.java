/*
programa que guada nombres y edades en una matriz de 2x2
*/
package integrador_c1_punto_2;

import java.util.Scanner;

/**
 *
 * @author jhon Fredy Mosquera Acosta
 */
public class Integrador_c1_punto_2 {

    public static void main(String[] args) {
       Scanner entrada  = new Scanner(System.in);  //utilizamos la libreria Scanner para la captura de datos 
       String[][]datos = new String [2][2];        //creamos la matriz de 2x2
       
      
       for(int i=0;i<2;i++){                                                //creamos la matriz
            System.out.println((i+1)+".INGRESE SU NOMBRE Y SU EDAD ");
           for(int j=0;j<2;j++){
               datos[i][j]=entrada.nextLine();
           }
       }
       
       System.out.println("NOMBRE    EDAD ");
       for(int i=0;i<2;i++){                                                //Mostramos la matriz jhon
           for(int j=0;j<2;j++){
               System.out.print(datos[i][j]+"\t");
           }
              System.out.println(" ");
       }
       
       
    }
    
}
