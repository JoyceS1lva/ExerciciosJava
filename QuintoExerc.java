package exercicios;
import java.util.Scanner;

public class QuintoExerc {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("O valor de um salário minimo é 788,00");
	double salariominimo = 788.00;
	
	System.out.println("Digite o valor do seu salario: ");
	double seusalario = scanner.nextFloat();
	
	double resultado = seusalario/salariominimo;
	
	System.out.printf("Você recebe: %.2f", resultado);
	
	}
}
