package IntroducaoJava;

 import java.util.Scanner;

 public class Exercicio_2 {
	 
	 public static void main(String[] args) {
		 
		 float anos=0, meses=0, dias=0, resultado=0;
		 Scanner in = new Scanner (System.in);
		 
		 System.out.print("Digite quantos anos voc� possui: ");
		 anos = in.nextFloat();
		 System.out.print("Digite quantos meses voc� possui: ");
		 meses = in.nextFloat();
		 System.out.print("Digite quantos dias voc� possui: ");
		 dias = in.nextFloat();
		 
		 resultado= anos*365 + meses*30 + dias;
		 
		 System.out.println("Sua idade em dias �: "+resultado);
		 
		 
	 }
 } 
	
	 
	
	
	
	


