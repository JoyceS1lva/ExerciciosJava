package exercicios;
import java.util.Scanner;

public class SegundoExerc {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	 System.out.println("Digite o primeiro numero: ");
    	 int primeiro = scanner.nextInt();
    	 
    	 System.out.println("Digite o segundo numero: ");
    	 int segundo = scanner.nextInt();
    	 
    	 System.out.println("Digite o terceiro numero: ");
    	 int terceiro = scanner.nextInt();
    	 
    	 float media1 = (primeiro + segundo + terceiro) / 3;
    	
    	 
    	 System.out.println("Digite o quarto numero: ");
    	 int primeiro2 = scanner.nextInt();
    	 
    	 System.out.println("Digite o quinto numero: ");
    	 int segundo2 = scanner.nextInt();
    	 
    	 System.out.println("Digite o sexto numero: ");
    	 int terceiro2 = scanner.nextInt();
    	 
    	 float media2 = (primeiro2 + segundo2 + terceiro2) / 3;
    	 
    	 float resultmedias = (media1 + media2)/2;
    			 
    			 
    	 System.out.println("A media aritmetica dos numeros: " + primeiro + "," + segundo + "," + terceiro + " é " + media1);
    	 System.out.println("A media aritmetica dos numeros: " + primeiro2 + "," + segundo2 + "," + terceiro2 + " é " + media2);
    	 System.out.println("O resultado da media aritmetica das duas medias anteriores é: " + resultmedias);
    	 
    }
    }



