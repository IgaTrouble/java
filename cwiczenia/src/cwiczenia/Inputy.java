package cwiczenia;

import java.util.Scanner;

public class Inputy {

	public static void main(String[] args) {
		System.out.println("Podaj imi�: ");
		Scanner rl = new Scanner(System.in);
		String g = rl.nextLine();
		System.out.println("Podaj ile lat");
		int wiek = rl.nextInt(); //rl.nextLine(); trzeba doda� bo nie zjada ko�ca lini
		
	// zamiana str na int int wiekI = Integer.valueOf(wiek);
	//	double wzrost = rl.nextDouble(); zamiast kropki, przecinek
	// rl.next()
		System.out.println("To ja:" + g + " i mam lat " + wiek);
		rl.close();
	}

}
