package day2;

import java.util.Scanner;

public class Cwj20 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê 1: ");
		float liczba1 = rl.nextFloat();
		System.out.println("Podaj liczbê 2: ");
		float liczba2 = rl.nextFloat();
		System.out.println("Podaj liczbê 3: ");
		float liczba3 = rl.nextFloat();
		double g = Math.round((((liczba1 + liczba2 + liczba3)/3)*1000) / 1000d); // zaokr¹glanie to mno¿enie i dzielenie
		System.out.println(g);
		System.out.println((liczba1 + liczba2 + liczba3)/3); // mo¿na te¿ i++ l1+l2+l2/i
	}

}
