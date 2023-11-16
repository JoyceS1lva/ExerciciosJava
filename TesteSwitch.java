package exercicios;
import java.util.Scanner;

public class TesteSwitch {
	public static void main(String[] args) {
		int DiaSemana;
		String NomeDia;
		
		Scanner Dia = new Scanner(System.in);
		
		System.out.println("Entre com o numero da semana:");
		DiaSemana = Dia.nextInt();
		
		switch(DiaSemana)   {
		case 1:NomeDia="Domingo";break;
		case 2:NomeDia="Segunda";break;
		case 3:NomeDia="Terça";break;
		case 4:NomeDia="Quarta";break;
		case 5:NomeDia="Quinta";break;
		case 6:NomeDia="Sexta";break;
		case 7:NomeDia="Sabado";break;
		default: NomeDia="Dia inválido";
		}
		
		System.out.println(NomeDia);
	}

}
