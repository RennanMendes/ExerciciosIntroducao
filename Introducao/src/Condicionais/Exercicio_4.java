package Condicionais;

import java.util.Scanner;

public class Exercicio_4 {
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		float num=0, rest=0, x=0;
		boolean teste;
	
		System.out.print("Digite um n?mero: ");
		num=in.nextFloat();
		
		rest=num%2;
		teste=rest==0;
		
		if (teste)
		{
			x= (float) Math.sqrt(num);
			System.out.println("O n?mero digitado ? par e sua raiz quadrada ? "+x);
		}
		else
		{
			x= (float) Math.pow(num,2);
			System.out.println("O n?mero digitado ? impar e o mesmo elevado ao quadrado ? "+x);
		} 
	
	}
	

}
