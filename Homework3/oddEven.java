/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      
      	int numero= Integer.parseInt(args[0].toString());
      System.out.println(args[0]);
   
   		// si el numero es impar
   		if (numero%2==0) {
   			System.out.println("numero es par");
   		}

   		else {
   		// si el numero es par
   			System.out.println("numero es impar");
   		}
   }
}