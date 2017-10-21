package day2;

import java.util.Scanner;
//next line trzeba poæwiczyæ przy double zczytuje a¿ do koñca linie, next zczytuje do koñca wyrazu
public class CwJ21 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in); 
		System.out.println("Podaj liczbê pierwsz¹  ");
		double a = rl.nextDouble(); 
		System.out.println("Podaj liczbê drug¹ ");
		double b = rl.nextDouble();
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

}
