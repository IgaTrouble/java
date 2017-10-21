package cwiczenia;

import static java.lang.Math.pow;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class J16 {
	public static void main(String[] args) {
		
		 Random rg; 
		 rg = new Random();
		 int i = rg.nextInt(10);
		 int z = rg.nextInt(50);
		 System.out.println(i);
		 System.out.println(z);
		 System.out.println("Czy i jest wiêksze czy z:" + (i > z));
		 System.out.println("Czy i jest wiêksze czy z:" + ((z > i+3) && (i-2<z)));
		 System.out.println("Czy i jest wiêksze czy z:" + ((i*z)%2 == 0));
		 
		 double a = 2;
		 double b = 9;
		 
		 System.out.println(Math.pow(a,b));
		 System.out.println(pow(a,b));
		 
		 BigInteger bI = new BigInteger("24875837923808208525830805626898986938080306");
		 BigInteger bII = new BigInteger("8756338652895686896582562836538658263886586358689653");
		 BigInteger big = bI.add(bII);
		 System.out.println("dodawanie: " + big); //nie mo¿na ³atwo dodawaæ, tylko trzeba stosowaæ metody klasy BigInteger
		 BigInteger big2 = bI.subtract(bII);
		 System.out.println("odejmowanie: " + big2);
		 BigInteger big3 = bI.multiply(bII);
		 System.out.println("mno¿enie: " + big3);		 
		 BigInteger big4 = bI.divide(bII);
		
		 BigDecimal big6 = new BigDecimal(bI).divide(new BigDecimal(bII)); // zmienne jako BigDecimal s¹ zmiennoprzecinkowe, bez okresu siê musz¹ dzieliæ 
		 System.out.println("dzielenie: " + (big4));				
		 
	}

	}
