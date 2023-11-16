package exercicios;
import java.util.Scanner;

public class TerceiroExerc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insira seu saldo");
		float saldo = scanner.nextFloat();
		
		saldo += (saldo/100);
		
		System.out.println("Seu saldo reajustado é = " + saldo);

	}

}
