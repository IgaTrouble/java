package petle_day2;

import java.util.Scanner;

public class J35 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczb�: ");
		int n = rl.nextInt();
		int x = 1;
		for (x = 1; x<=n; x++)
			System.out.println("Pot�ga 2 do " + x + " wynosi " + (int)Math.pow(2, x));
	}

}
