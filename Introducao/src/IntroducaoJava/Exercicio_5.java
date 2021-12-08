package IntroducaoJava;

import java.util.Scanner;

public class Exercicio_5 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float n1=0, n2=0,n3=0, media=0;
		
		System.out.print("Digite o valor da 1º Prova: ");
		n1 = in.nextFloat();
		System.out.print("Digite o valor da 2º Prova: ");
		n2 = in.nextFloat();
		System.out.print("Digite o valor da 3º Prova: ");
		n3 = in.nextFloat();
		
		media = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
		
		System.out.print("A média das provas é: "+media);
		
	}

}
