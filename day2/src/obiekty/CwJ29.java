package obiekty;

import day2_if.CwJ28;
import day2_if.CwJ27;

import java.util.Scanner;

import day2_if.CwJ26;
public class CwJ29 {

	public static void main(String[] args) {
		
		Scanner rl = new Scanner(System.in); 
		System.out.println("Podaj komendê: ");
		String komenda = rl.next();
		switch (komenda) {
		
		case "CwJ26":
			CwJ26.main(args);
			break;
		case "CwJ27":
			CwJ27.main(args);
			break;
		case "CwJ28":
			CwJ28.main(args);
			break;
		case "q":
			System.out.println("Koniec programu");
			break;
		default:
			System.out.println("Z³a komenda");
		}
			rl.close();
	}

}
