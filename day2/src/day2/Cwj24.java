package day2;

import java.util.Scanner;

public class Cwj24 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj wyraz: ");
		String wyraz = rl.nextLine();
		StringBuffer wyraz2 = new StringBuffer(wyraz);
		wyraz2 = wyraz2.reverse();
		System.out.println("Odwrotnie " + wyraz + " to jest: " + wyraz2);
		rl.close();

}
	
}
