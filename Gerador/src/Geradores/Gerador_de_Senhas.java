package Geradores;

import java.util.Scanner;
import java.util.Random;

class Gerador_de_Senhas {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		Random ran = new Random();

		String[] letras = { "0", "1", "b", "2", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h",
				"i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C",
				"D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X",
				"Y", "Z", "@", ".", "-", "+", "$", "&", "#", "*" };
		String b = "";

		System.out.print("Quantos caracteres deseja na sua senha?\n");
		System.out.print("Nª: ");
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			int a = ran.nextInt(letras.length);
			b += letras[a];
		}

		System.out.print("Senha Gerada: " + b);

	}

}