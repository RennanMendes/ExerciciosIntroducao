package Condicionais;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int num1=0, num2=0, num3=0, maior=0;
		
		System.out.print("Digite o primeiro n�mero: ");
		num1= in.nextInt();
		
		System.out.print("Digite o segundo n�mero: ");
		num2= in.nextInt();
		
		System.out.print("Digite o terceiro n�mero: ");
		num3= in.nextInt();
		
		if(num1>num2) 
			maior=num1;	
		
		else
			maior=num2;
		
		if(maior<num3)
			maior=num3;
		
		System.out.println("O mairo n�mero digitado �: " + maior);
		
	}

}
