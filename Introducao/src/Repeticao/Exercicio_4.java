package Repeticao;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		byte sexo=0, temperamento=0;
		short idade=0, maior=0, menor=0,x=0, calmo=0,mulheresNervosas=0,homensAgressivo=0, outrosCalmo = 0;
	
		
		while(x<150)
		{
			boolean mulheres=false, homens=false, outros=false, logicoCalmo=false,logicoNervoso=false,logicoAgressivo=false;
			
			System.out.print("\nInforme sua idade: ");
			idade = in.nextShort();
			
			System.out.print("\nInforme seu sexo sendo:\n1 - Feminino\n2 - Masculino\n3 - Outros ");
			sexo = in.nextByte();
						
			switch (sexo) 
			{
				case 1:
				{
					mulheres=true;
					break;
				}
				case 2:
				{
					homens=true;
					break;
				}
				case 3:
				{
					outros=true;
					break;
				}
				default:
					System.out.println("N�menor invalido");			
			}
			
			System.out.print("\nInforme seu temperamento sendo:\n1 - Calmo\n2 - Nervoso\n3 - Agressivo ");
			temperamento = in.nextByte();
						
			switch (temperamento) 
			{
				case 1:
				{
					calmo++;
					logicoCalmo=true;
					break;
				}
				case 2:
				{
					logicoNervoso=true;
					break;
				}
				case 3:
				{
					logicoAgressivo=true;
					break;
				}
				default:
					System.out.println("N�menor invalido");			
			}
			
			if(mulheres&&logicoNervoso) {
				mulheresNervosas++;	
			}
			if(homens&&logicoAgressivo) {
				homensAgressivo++;
			}
			if(outros&&logicoCalmo) {
				outrosCalmo++;
			}
			if(logicoCalmo&&idade<18)
				menor++;
			if(logicoNervoso&&idade>40)
				maior++;
			
			x++;
		}
		
		System.out.println("\nO n�mero de pessoas calmas: "+calmo);
		System.out.println("O n�mero de mulheres nervosas: "+mulheresNervosas);
		System.out.println("O n�mero de homens agressivos: "+homensAgressivo);
		System.out.println("O n�mero de outros calmos: "+outrosCalmo);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: "+maior);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos: "+menor);
		
		in.close();
		
		

	}

}
