package exercicios;
import java.util.Scanner;


public class QuartoExerc {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("A porcentagem IPI das pe�as (sem simbolo de porcentagem) : ");
	int ipi = scanner.nextInt();
	
	System.out.print("Digite o codigo da primeira pe�a: ");
	int cod1 = scanner.nextInt();
	
	System.out.print("Digite a quantidade da primeira pe�a: ");
	int quant1 = scanner.nextInt();
	
	System.out.print("Digite o valor da primeira pe�a: ");
	float valor1 = scanner.nextFloat();
	
	
	
	System.out.print("Digite o codigo da segunda pe�a: ");
	int cod2 = scanner.nextInt();
	
	System.out.print("Digite a quantidade da segunda pe�a: ");
	int quant2 = scanner.nextInt();
	
	System.out.print("Digite o valor da segunda pe�a: ");
	float valor2 = scanner.nextFloat();
	
	
	float resultado = (valor1 * quant1 + valor2 * quant2)*(ipi/100+1);
	
	System.out.print("O valor total a ser pago �: " + resultado);
	

	}
}
