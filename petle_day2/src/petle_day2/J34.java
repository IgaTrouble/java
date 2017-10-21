package petle_day2;

import java.util.Scanner;

public class J34 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		int A = rl.nextInt();
		System.out.println("Podaj liczbê drug¹: ");
		int B = rl.nextInt();
		int i = 0
		if(A<B) {
			int suma = 0;
			for(i=A; i<=B; i+=1) {
				suma = suma + i;
			}
			System.out.println("Suma ci¹gu: " + suma );
			
			int suma2 = 0;
			i = A;
			while (i <=B) {
				suma2 += i;
				i++;
			}
			System.out.println("Suma" + suma2);
			
	
			int suma3 = 0;
			i = A;
			do {
				suma3 += i;
				i++;
				while(A==B) {
				A ++;
						System.out.println("Kolejna suma" + suma3);
				
			}
			}
			
		}
	}	
		
}
