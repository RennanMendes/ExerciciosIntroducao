package Arrays;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1[][]=new int [3][3], soma=0, diagonal=0;
		
		System.out.println("Informe os valores da matriz: ");
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<3;coluna++)
			{
				n1[linha][coluna]=in.nextInt();
				soma=soma+n1[linha][coluna];
				
				if(linha==coluna)
				{
					diagonal+=n1[linha][coluna];
				}
			}
		}
		
		System.out.println("A soma total da matriz é: "+ soma);
		System.out.println("A soma da diagonal principal é: "+ diagonal);
		in.close();

	}

}
