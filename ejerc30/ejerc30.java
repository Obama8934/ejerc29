package ejerc30;

import java.util.Scanner;

public class ejerc30 {
     public static void main(String[] args) {
		
    	 int[] numerosSocios = {1011, 2367, 8748, 9121, 817, 6423, 2034};
         String[] nombresSocios = {"Enrique", "Liliana", "Lucas", "Juan", "Fiorella", "Ariel", "Daiana"};

       Scanner scanner = new Scanner(System.in);
    	 
       System.out.println("ingrese numero de socio");
       int ingreso = scanner.nextInt();
       
       for (int i = 0; i < numerosSocios.length; i++) {
		
    	   if(ingreso == numerosSocios[i]) {
    		   System.out.println("numero de socio de: " + nombresSocios[i]);
    		   System.err.println("numero de socio: " + numerosSocios[i]);
    	   }
    	   
    	 
	}
	}
}
