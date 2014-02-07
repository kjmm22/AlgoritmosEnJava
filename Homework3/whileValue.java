
public class whileValue {   

   public static void main(String[] args) {
   		int valorActual = 0;
   		int valorFinal=0;

   		valorActual = Integer.parseInt(args[0].toString());

   	

   		  while(valorFinal<valorActual)
      {
      		System.out.println("El valor actual es: " +valorFinal);

      		valorFinal++;
      }


   }

}