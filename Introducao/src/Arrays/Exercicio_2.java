package Arrays;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		float media=0;
		int dado[]=new int[11], maior=0, nx=1;
		
		for(int c=1;c<11;c++)
		{
			System.out.print("Informe o valor do dado: ");
			dado[c]= in.nextInt();
			
			if(maior<dado[c])
			{
				maior=dado[c];
			}
			else if(maior==dado[c])
			{
				nx++;
			}
			
			dado[0]=dado[0]+dado[c];
		}
		
		media = dado[0]/10;
		
		System.out.println("Os valores do vetor s�o: ");
		
		for(int c=1;c<11;c++)
		{
			System.out.print(dado[c]+"\t");
		}
		
		System.out.println("\nA m�dia dos lan�amentos �: "+ media);
		System.out.println("A maior lan�amento � " + maior + " e aconteceu "+ nx+" vezes");
		
		in.close();
	}
	


}
