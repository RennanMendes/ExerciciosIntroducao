package IntroducaoJava;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		float custo=0;
		double venda=0;
		
		System.out.print("Informe o custo de fabrica??o: ");
		custo= in.nextFloat();
		
		venda = custo*1.73;
		
		System.out.println("A venda do veiculo ?: "+venda);		

	}

}
