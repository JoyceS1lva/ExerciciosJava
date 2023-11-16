package exercicios;
import java.util.Scanner;


public class QuartoExerc {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("A porcentagem IPI das peças (sem simbolo de porcentagem) : ");
	int ipi = scanner.nextInt();
	
	System.out.print("Digite o codigo da primeira peça: ");
	int cod1 = scanner.nextInt();
	
	System.out.print("Digite a quantidade da primeira peça: ");
	int quant1 = scanner.nextInt();
	
	System.out.print("Digite o valor da primeira peça: ");
	float valor1 = scanner.nextFloat();
	
	
	
	System.out.print("Digite o codigo da segunda peça: ");
	int cod2 = scanner.nextInt();
	
	System.out.print("Digite a quantidade da segunda peça: ");
	int quant2 = scanner.nextInt();
	
	System.out.print("Digite o valor da segunda peça: ");
	float valor2 = scanner.nextFloat();
	
	
	float resultado = (valor1 * quant1 + valor2 * quant2)*(ipi/100+1);
	
	System.out.print("O valor total a ser pago é: " + resultado);
	

	}
}
