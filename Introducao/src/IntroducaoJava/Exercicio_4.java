package IntroducaoJava;

import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		int a=0, b=0, c=0, d=0, r=0, s=0;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite o Valor de A: ");
		a= in.nextInt();
		System.out.print("Digite o valor de B: ");
		b= in.nextInt();
		System.out.print("Digite o valor de C: ");
		c = in.nextInt();
		
		r=(a+b)*(a+b);
		s=(b+c)*(b+c);
		d=(r+s)/2;
		
		System.out.println("O resultado é: "+d);
		
	}

}
