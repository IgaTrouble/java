package day2;

import java.util.Scanner;
//next line trzeba po�wiczy� przy double zczytuje a� do ko�ca linie, next zczytuje do ko�ca wyrazu
public class CwJ21 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in); 
		System.out.println("Podaj liczb� pierwsz�  ");
		double a = rl.nextDouble(); 
		System.out.println("Podaj liczb� drug� ");
		double b = rl.nextDouble();
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

}
