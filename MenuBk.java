package exercicios;
import java.util.Scanner;

public class MenuBk {
    public static void main(String[] args) {
    	int NumeroCardapio;
    	String DescLanche;
    	
    	Scanner Cardapio = new Scanner(System.in);
    	
    	System.out.println("CARDAPIO BK: ");
    	System.out.println("1. Whopper");
    	System.out.println("2. Cheeseburger");
    	System.out.println("3. Chicken Nuggets");
    	System.out.println("4. Fish Sandwich");
    	System.out.println("5. Fries");
    	System.out.println("6. Onion Rings");
    	System.out.println("7. Soft Drink");
    	
    	
    	System.out.println("Escolha uma das opções do cardapio de 1-7: ");
    	NumeroCardapio = Cardapio.nextInt();
    	
    	switch(NumeroCardapio) {
    	
    	case 1:DescLanche="Seu combo escolhido foi Whopper: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 2:DescLanche="Seu combo escolhido foi Cheeseburguer: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 3:DescLanche="Seu combo escolhido foi Chicken Nuggets: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 4:DescLanche="Seu combo escolhido foi Fish Sandwich: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 5:DescLanche="Seu combo escolhido foi Fries: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 6:DescLanche="Seu combo escolhido foi Onio Rings: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	case 7:DescLanche="Seu combo escolhido foi Soft Drink: 2 pães, hamburguer, alface, picles, molho especial, tomate e cebola + batata + refri ";break;
    	default: DescLanche="Numero do cardapio invalido";
    	}
    	
    	System.out.println (DescLanche);
    	System.out.println("Bom apetite!");
    	
    	
    	
    	
    	
    }
}
