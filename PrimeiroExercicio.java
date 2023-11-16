package exercicios;
import java.util.Scanner;

public class PrimeiroExercicio {
     public static void main(String[] args) {
    	 
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.print("Insira quantos anos você tem? ");
    	 	int anos = scanner.nextInt();
    	 	
 
    	 System.out.print("Insira quantos meses você tem? ");
     	 	int meses = scanner.nextInt();
     	
     	 	
     	 System.out.print("Insira quantos dias você tem? ");
     	 	int dias = scanner.nextInt();
     	 	
     	 	
     	 int total = anos*365+ meses*30 + dias;
     	 
     	 System.out.println("Sua idade em dias é: " + total);
    	 
     }
	
}
