package Repeticao;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String [] args) {
		
		Scanner in = new Scanner (System.in);
		int num=0, par=0, impar=0;
		
		for(int x=1;x<=10;x++)
		{
			System.out.print("Digite o "+x+"? n?mero: ");
			num= in.nextInt();
			
			if(num%2==0)
				par ++;
			else
				impar++;
		}
		
		in.close();
		
		System.out.print("N?meros par = "+par+"\nN?emros impar = "+impar);
		
	}

}
