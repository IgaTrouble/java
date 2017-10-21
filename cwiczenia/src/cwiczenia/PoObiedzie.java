package cwiczenia;

import java.util.Random;

public class PoObiedzie {

	public static void main(String[] args) {

		int i = 5;
		double o = 13.5675;
		int k = (int)o/i;
		System.out.println(Math.round(o)); //zaokr¹glanie matematyczne
		System.out.println((int)o); //obcinanie
		System.out.println(Math.round(o*1000)/1000d); //zaokr¹glanie do iluœ miejsc po przecinku buahahah
		 String str1 = "ala ma";
		 String str2 = "ala ma";
		 System.out.println(str1==str2);
		 
		 String str4 = "ala ma";
		 String str5 = "ma";
		 String str3 = "ala " + str5;
		 str3 = "nowy";
		 String str7= "bla";
		 str3 = "ala ma";
		 System.out.println(str3);
		 System.out.println(str4);
		 System.out.println(str4==str3);  //sprawdz to 
		 System.out.println(str4.equals(str3)); //obiekt porównujemy metod¹ equels inne refenrencje czy coœ
		 float a = 13.5f;
		 float b = 5.65f;
		 System.out.println((int)(a/b));
		 System.out.println(-5+8*6);
		 System.out.println((55+9)%9);
		 System.out.println(20+ (-3)*5/8);
		 System.out.println(5+15/3*2 -8%3);
	}

}
