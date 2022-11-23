package Jokenpo;

import java.util.Scanner;

public class Main {

	public static Jokenpo startGame() {
		System.out.println("Jo-Ken-PO\n");
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome");
		String playernickname = scan.next().toUpperCase();

		Player user = new Player(playernickname);

	}

	public static void main(String[] args) {

	}

}
 // 1:08:44