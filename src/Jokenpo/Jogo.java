package Jokenpo;

import java.util.Scanner;

public record Jogo(
		Jogador usuario, 
		Jogador IA, 
		int rodadas
		) {

	public void Jogue() {
	
		System.out.println("----Bem-vindo(a)," + usuario.getNome() + "----\n" );
		int escolhaUsuario = escolhaUsuario();
		
		if(escolhaUsuario< 1|| escolhaUsuario > 3) {
		System.out.println("\n Escolha Inválida!! Escolha entre(1, 2 e 3): ");
		System.out.println("\tPonto para " + IA.getNome() + "\n");
		}
	}
	

	private int escolhaUsuario() {	
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Pedra");
		System.out.println("2- Papel");
		System.out.println("3- Tesoura");

		System.out.println("Informe sua escolha");
		return scan.nextInt();

	}
}
