package day2_if;

import java.util.Scanner;

public class CwJ26 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê pierwsz¹: ");
		double liczba1 = rl.nextDouble();
		rl.nextLine();
		System.out.println("Podaj znak dzia³ania matematycznego: *, /, + lub -: ");
		String dzialanie = rl.nextLine();
		System.out.println("Podaj liczbê drug¹: ");
		double liczba2 = rl.nextDouble();
		
		switch (dzialanie) {
		case "+":
			System.out.println(liczba1+liczba2);
			break;
		case "-":
			System.out.println(liczba1-liczba2);
			break;
		case "*":
			System.out.println(liczba1*liczba2);
			break;
		case "/":
			System.out.println(liczba1/liczba2);
			break;
		default: 
			System.out.println("b³êdny znak");
		}
	}

}
