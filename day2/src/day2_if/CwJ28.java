package day2_if;

import java.util.Random;
import java.util.Scanner;

public class CwJ28 {

	public static void main(String[] args) {
		Random g1 = new Random();
		int liczba1 = g1.nextInt(10); 
		int liczba2 = g1.nextInt(10); 
		int liczba3 = g1.nextInt(15); 
		int liczba4 = g1.nextInt(10); 
		int liczba5 = g1.nextInt(15); 
		System.out.println(liczba1 + " " + liczba2 +  " " + liczba3+ " " + liczba4 + " " + liczba5);
		Scanner rl = new Scanner(System.in);
		System.out.println("podaj liczbê: ");
		int twojal = rl.nextInt();
		
		if(liczba1>twojal) {
			System.out.println("Twoja mniejsza");
		}
		else if(liczba1<twojal) {
			System.out.println("Twoja wiêksza");
		}
		else{
			System.out.println("równa");
		}
		if(liczba2>twojal) {
			System.out.println("Twoja mniejsza");
		}
		else if(liczba2<twojal) {
			System.out.println("Twoja wiêksza");
		}
		else{
			System.out.println("równa");
		}
		if(liczba3>twojal) {
			System.out.println("Twoja mniejsza");
		}
		else if(liczba3<twojal) {
			System.out.println("Twoja wiêksza");
		}
		else{
			System.out.println("równa");
		}
		if(liczba4>twojal) {
			System.out.println("Twoja mniejsza");
		}
		else if(liczba4<twojal) {
			System.out.println("Twoja wiêksza");
		}
		else{
			System.out.println("równa");
		}
		if(liczba5>twojal) {
			System.out.println("Twoja mniejsza");
		}
		else if(liczba5<twojal) {
			System.out.println("Twoja wiêksza");
		}
		else{
			System.out.println("równa");
		}
		
	}

}
