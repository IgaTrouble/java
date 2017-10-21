package day2_if;

import java.io.FilterInputStream;
import java.util.Scanner;

public class Switch_1 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		
		System.out.println("Kim jesteœ?: ");
		String osoba = rl.nextLine();
		
		switch (osoba) {
		case "Iga":
			System.out.println("Hej Iga, jesteœ zwyciêzc¹");
			break;
		case "Mama":
			System.out.println("Hej Mamcia, jak ¿ycie?");
			break;
		default:
			System.out.println("Kim Ty jesteœ? Nie znam Ciê ");			
			
		}
		}

	}

