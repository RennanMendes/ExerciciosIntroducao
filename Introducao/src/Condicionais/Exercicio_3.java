package Condicionais;

import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int idade =0;
		
		System.out.print("Digite sua idade: ");
		idade = in.nextInt();
		
		if(idade<10||idade>25) 
		{
			System.out.println("Idade Invalida!");		
		}
		
		else if(idade>=10 && idade<=14) 
		{
			System.out.println("Voc� se encontra na categoria infantil!");		
		}
		
		else if(idade>=15 && idade<=17) 
		{
			System.out.println("Voc� se encontra na categoria juvenil!");		
		}
		
		else
		{
			System.out.println("Voc� se encontra na categoria adulto!");
		}
		
		
			
		
		
		
		
		
	}

}
