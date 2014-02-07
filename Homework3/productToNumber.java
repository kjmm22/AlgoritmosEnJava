/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Despliege la multiplicacion desde 0 hasta un valor 'n' dado.
Ej:
Si si ingresa 6
mostrar
1x2x3x4x5x6=720

*/

public class productToNumber {   

   public static void main(String[] args) {
   		int limite1=1;
   	int limite2= Integer.parseInt(args[0]);
   	int resultado=1;

		System.out.println("El resultado es:" );
         System.out.println(" ");
   		for(limite1=1;limite1<=limite2;limite1++){
          if(limite1<limite2){
            System.out.print(limite1+"x");
          }
          else{
            System.out.print(limite1+"=");
          }
          resultado=resultado*limite1;
          
      }
      System.out.print(resultado);
   }

}