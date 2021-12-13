package Arrays;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		float pontuacao[] = new float[5], maior=0;
		
		for(int c=0;c<5;c++)
		{
			System.out.print("Informe a pontuação: ");
			pontuacao[c]=in.nextFloat();
			
			if(maior<pontuacao[c])
			{
				maior=pontuacao[c];
			}
		}
		
		for(int c=0;c<5;c++)
		{
			System.out.print(pontuacao[c]+"\t");
		}
		 System.out.println("\nA maior pontuação é: " + maior);
		 in.close();
	}

}
