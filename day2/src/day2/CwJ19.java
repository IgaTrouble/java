package day2;

import java.util.Scanner;

public class CwJ19 {
	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj imi�: ");
		String imie = rl.nextLine();
		System.out.println("Podaj nazwisko: ");
		String nazwisko = rl.nextLine();
		System.out.println("Podaj liczb�: ");
		float liczba = rl.nextFloat();
		float potega = rl.nextFloat();
		double wynik = Math.pow(liczba, potega); // (int)Math.pow(liczba, potega) wtedy
		System.out.println("Witaj " + imie + " " + nazwisko + " na kursie Javy!");
		System.out.println(wynik);
	}
}
