package exercicios;
import java.util.Scanner;

public class PrimeiroExercicio {
     public static void main(String[] args) {
    	 
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.print("Insira quantos anos voc� tem? ");
    	 	int anos = scanner.nextInt();
    	 	
 
    	 System.out.print("Insira quantos meses voc� tem? ");
     	 	int meses = scanner.nextInt();
     	
     	 	
     	 System.out.print("Insira quantos dias voc� tem? ");
     	 	int dias = scanner.nextInt();
     	 	
     	 	
     	 int total = anos*365+ meses*30 + dias;
     	 
     	 System.out.println("Sua idade em dias �: " + total);
    	 
     }
	
}
