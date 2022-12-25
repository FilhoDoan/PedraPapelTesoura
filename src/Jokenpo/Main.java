package Jokenpo;

import java.util.Scanner;

public class Main {

	public static Jogo comecoJogo(){

		System.out.println("----Jo-Ken-Po----\n");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nomejogador = scan.next().toUpperCase();
		
		Jogador usuario = new Jogador(nomejogador, 0);
		Jogador IA = new Jogador("IA", 0);

		System.out.println(nomejogador + ", informe o numero de rodadas desejadas: ");
		int rodadas = scan.nextInt();
		
		return new Jogo(usuario,IA, rodadas);
	}
	
	public static void main (String[] args) {

		Jogo jogo = comecoJogo();
		jogo.Jogue();
			
	}

}