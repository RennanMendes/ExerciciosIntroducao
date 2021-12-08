package IntroducaoJava;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float x1=0, y1=0, x2=0, y2=0;
		double z1=0, z2=0, d=0;
		
		
		System.out.print("Insira o valor do ponto X1: ");
		x1=in.nextFloat();
		System.out.print("Insira o valor do ponto Y1: ");
		y1=in.nextFloat();
		System.out.print("Insira o valor do ponto X2: ");
		x2=in.nextFloat();
		System.out.print("Insira o valor do ponto Y2: ");
		y2=in.nextFloat();
		
		z1= Math.pow((x2-x1), 2);
		z2= Math.pow((y2-y1), 2);
		d= Math.sqrt((z1+z2));
		
		System.out.println("A distancia entre os dois pontos é: "+d);
		
		
		
		
		

	}

}
