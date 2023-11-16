package exercicios;
import java.util.Scanner;

public class SextoExerc {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite um numero inteiro: ");
	int numero = scanner.nextInt();
	
	int sucessor = numero + 1;
	int antecessor = numero -1;
	
	System.out.println("O numero sucessor de " + numero + " é " + sucessor);
	System.out.println("O numero antecessor de " + numero + " é " + antecessor);
	
	}
}
