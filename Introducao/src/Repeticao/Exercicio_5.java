package Repeticao;

import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x=0, soma=0;
		
		do
		{
			System.out.print("Digite um n�mero: ");
			x= in.nextInt();
			
			soma=soma+x;				
		}while(x!=0);
		
		System.out.print("\nA soma dos n�emeros digitados �: "+soma);
		in.close();
		
		
	}

}
