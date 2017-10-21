package day2;

import java.util.Scanner;
import static java.lang.Math.*;

public class Cwj23 {

	public static void main(String[] args) {
		Scanner rl = new Scanner(System.in);
		System.out.println("Podaj koordynaty: ");
		double x1 = rl.nextDouble();
		double x2 = rl.nextDouble();
		double y1 = rl.nextDouble();
		double y2 = rl.nextDouble();
		double dist = sqrt(pow((x1-x2),2) + pow((cos(x1*PI/180)*(y2-y1)),2)) * 111;  	
		System.out.println(dist);
	
	}


}


