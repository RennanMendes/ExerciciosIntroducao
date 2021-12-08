package IntroducaoJava;

 import java.util.Scanner;

 public class Exercicio_2 {
	 
	 public static void main(String[] args) {
		 
		 float anos=0, meses=0, dias=0, resultado=0;
		 Scanner in = new Scanner (System.in);
		 
		 System.out.print("Digite quantos anos você possui: ");
		 anos = in.nextFloat();
		 System.out.print("Digite quantos meses você possui: ");
		 meses = in.nextFloat();
		 System.out.print("Digite quantos dias você possui: ");
		 dias = in.nextFloat();
		 
		 resultado= anos*365 + meses*30 + dias;
		 
		 System.out.println("Sua idade em dias é: "+resultado);
		 
		 
	 }
 } 
	
	 
	
	
	
	


