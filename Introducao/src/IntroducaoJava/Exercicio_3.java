package IntroducaoJava;

import java.util.Scanner;

public class Exercicio_3 {

	 public static void main(String[] args) {
		 
		 int h=0, m=0, s=0;
		 float ev=0, t=0;
		 Scanner in = new Scanner (System.in);
		 
		 System.out.println("Informe o tempo de duração do evento em segundos: ");
		 ev= in.nextFloat();
		 
		 t= ev;
		 h=(int) ev/3600;
		 t=ev-(h*3600);
		 m= (int) t/60;
		 s=(int)t-m*60;
				
		System.out.println("O tempo de duração é de, "+h+" horas "+m+" minutos e "+s+" segundos"); 	 
		 
	 }
	
}
