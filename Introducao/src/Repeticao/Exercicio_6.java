package Repeticao;

import java.util.Scanner;

public class Exercicio_6 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x =0, soma=0, cont=0;
		
		
		
		do
		{
			System.out.print("Digite um n?mero: ");
			x=in.nextInt();
			if (x!=0)
			{
				if(x%3==0)
				{
					soma=soma+x;
					cont ++;
				}
			}
			
		}while(x!=0);
		
		in.close();
		System.out.println("A m?dia dos n?emros digitados multipos de 3 ?: "+soma/cont);
	}

}
