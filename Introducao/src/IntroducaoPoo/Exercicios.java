package IntroducaoPoo;

import java.util.Scanner;

public class Exercicios {
	
	public static void main (String[] args) {
		
Scanner in = new Scanner (System.in);
		
		byte escolha=0;
		
		System.out.println("Escolha uma das op��es abaixo:\n1 - Cliente\n2 - Avi�o\n3 - Elet�nico\n4 - Funcionario\n5 - Patinete\n6 - Conta Bancaria\n7 - Paciente");
		escolha=in.nextByte();
		
		switch (escolha)
		{
			case 1:
			{
				Cliente cliente = new Cliente();
				System.out.println("Informe o genero do cliente: ");
				cliente.setGenero(in.next());
				System.out.println("Informe a idade do cliente: ");
				cliente.setIdade(in.nextInt());
				System.out.println("Informe o produto de interesse do cliente: ");
				cliente.setInteresse(in.next());
				System.out.println("Informe a verba do cliente: ");
				cliente.setSaldo(in.nextDouble());
				cliente.status();
				break;
			}
			case 2:
			{
				Aviao voo = new Aviao();
				
				System.out.println("Escolha a cor do avi�o: ");
				voo.setCor(in.next());
				System.out.println("Particular ou publico? ");
				voo.setModelo(in.next());
				System.out.println("Escolha a companhia ");
				voo.setCompanhia(in.next());
				voo.status();
				voo.liga();
				voo.passageirosAbordo();
				voo.decolar();
				break;
			}
			case 3:
			{
				Eletronico pc = new Eletronico();
				
				System.out.println("Deseja comprar um PC ou Notebook? ");
				pc.setTipo(in.next());
				System.out.println("Digite um nome para o produto");
				pc.setNome(in.next());
				System.out.println("As informa��es de hardware do produto s�o:");
				System.out.println("Sistema: "+pc.getSistema());
				System.out.println("Processador: "+pc.getProcessador());
				System.out.println("Mem�ria RAM: "+pc.getMemoriaRam());
				System.out.println("SSD: "+pc.getSsd());
				System.out.println("Placa de video: "+pc.getPlacaVideo());
				System.out.println("Deseja adquirir o " +pc.getNome()+" true/false");
				pc.setComprar(in.nextBoolean());
				pc.status();
				break;
			}
		}
		
		in.close();
	}

}