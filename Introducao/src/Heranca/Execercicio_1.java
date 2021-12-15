package Heranca;

import java.util.Scanner;

public class Execercicio_1 {
	
	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro();
		Cavalo horse = new Cavalo();
		Preguica sloth = new Preguica();
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		dog.setNome(in.next());
		System.out.println("Digite a idade: ");
		dog.setIdade(in.nextInt());
		dog.emitirSom();
		dog.correr();
		
		System.out.println("Digite o nome: ");
		horse.setNome(in.next());
		System.out.println("Digite a idade: ");
		horse.setIdade(in.nextInt());
		horse.correr();
		
		System.out.println("Digite o nome: ");
		sloth.setNome(in.next());
		System.out.println("Digite a idade: ");
		sloth.setIdade(in.nextInt());
		sloth.subir();
		
		in.close();
		
		System.out.println("O nome o cachorro �: "+dog.getNome());
		System.out.println("A idade do cachorro �: "+dog.getIdade());
		System.out.println("Esta emitindo som? "+dog.getSom());
		System.out.println("Esta correndo? "+dog.getCorrer());
		
		System.out.println("\nO nome o cavalo �: "+horse.getNome());
		System.out.println("A idade do cavalo �: "+horse.getIdade());
		System.out.println("Esta emitindo som? "+horse.getSom());
		System.out.println("Esta correndo? "+horse.getCorrer());
		
		System.out.println("\nO nome da pregui�a �: "+sloth.getNome());
		System.out.println("A idade do cavalo �: "+sloth.getIdade());
		System.out.println("Esta emitindo som? "+sloth.getSom());
		System.out.println("Esta correndo? "+sloth.getSubir());
	}

}