package Repeticao;

public class Exercicio_1 {
	
	public static void main (String[] args) {
		
		float modulo =0;
		int contador =0;
		
		for(int x=1000; x<=1999;x++)
		{
			modulo=x%11;
			
			if(modulo==5)
				contador ++;
			
		}
		
		System.out.print("O resto 5 se repete "+contador+" vezes quando dividimos os numeros de 1000 a 1999 por 11");
		
	}

}
