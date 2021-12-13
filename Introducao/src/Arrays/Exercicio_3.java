package Arrays;

import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main (String[] args) {
		
		Scanner in= new Scanner(System.in);
		int n1[][]=new int[4][6], n2[][]=new int [4][6], m1[][]= new int [4][6], m2[][]=new int [4][6];
		
		System.out.println("Informe os valores da matriz N1: ");
		for  (int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				n1[linha][coluna]=in.nextInt();	
			}
		}
		
		System.out.println("Informe os valores da matriz N2: ");
		for  (int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				n2[linha][coluna]=in.nextInt();	
			}
		}
		
		for  (int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				m1[linha][coluna]=n1[linha][coluna]+n2[linha][coluna];
				m2[linha][coluna]=n1[linha][coluna]-n2[linha][coluna];
			}
		}
		
		System.out.println("A soma das matrizes �: \n");
		for  (int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				System.out.print(m1[linha][coluna]+"\t");
			}
			System.out.println("\t");
		}
		
		System.out.println("\nA diferen�a das matrizes �: \n");
		for  (int linha=0;linha<4;linha++)
		{
			for(int coluna=0;coluna<6;coluna++)
			{
				System.out.print(m2[linha][coluna]+"\t");
			}
			System.out.println("\t");
		}
		
		in.close();
		
	}
	

}
