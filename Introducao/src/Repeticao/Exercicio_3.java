package Repeticao;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int idade=0, menor=0, maior=0;
		
		System.out.print("Digite sua idade: ");
		idade= in.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
				menor++;
			if(idade>50)
				maior++;
			System.out.println("\nPessoas com menos de 21 anos - "+menor+"\nPessoas com mais de 50 anos - "+maior);
			System.out.println("\nDigite sua idade ou -99 para finalizar1: ");
			idade= in.nextInt();
		}
		
		System.out.print("-99Programa finalizado! ");
		in.close();
		
	}
	
	
}
