package exs_estrutura_condicional;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = sc.nextInt();
		if(numero % 2 == 0)
		{
			System.out.println("PAR");
		}else {
			System.out.println("ÍMPAR");
		}
		
		
		
		sc.close();
	}

}
