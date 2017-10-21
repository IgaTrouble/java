package day2;

import java.util.Scanner;

public class CwJ22 {
	public static void main(String[] args) {
	Scanner rl = new Scanner (System.in);
	System.out.println("Podaj liczbê boku: ");
	double a = rl.nextDouble();
	double szczes = ((3 * Math.pow(a, 2))* Math.pow(3, 0.5))/2;
	double szczes2 = ((3 * Math.pow(a, 2))* Math.sqrt(3))/2;
	double szczes3 = Math.round((((3 * Math.pow(a, 2))* Math.sqrt(3))/2)*1000)/1000;
	System.out.println(szczes);
	System.out.println(szczes2);
	System.out.println(szczes3);
			
}

}
