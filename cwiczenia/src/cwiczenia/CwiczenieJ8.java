package cwiczenia;

public class CwiczenieJ8 {

	public static void main(String[] args) {
		
		String z1 = "Jeden ";
		String z2 = "Dwa ";
		String z3 = z1 + z2;
		String z4 = z3 + "Osiem ";
		String z5 = z3.toLowerCase();
		String z6 = z4.toUpperCase();
	System.out.println(z5 + " " + z6);
	System.out.println(z4.length());
	char z10 = z4.charAt(2);
	char z11 = z4.charAt(5);
	System.out.println(z11);
	char z12 = z4.charAt(z4.length()-4);
	System.out.println(z12);
	System.out.println("pierwsza zmienna:" + z10 +" druga zmienna " + z11 +" trzciecia zmienna  " + z12);
	
	//æwiczenie J10
	System.out.println(z4);
	System.out.println(z12);
	System.out.println(z4.substring (0, z1.length() +  z1.length()+z2.length()));
	System.out.println(z4.substring(z1.length(), 10));
	System.out.println(z4.substring (0, 6));
	int firstBlind = z4.indexOf(" ");
	int secBlind = firstBlind + z4.substring(firstBlind +1).indexOf(" ");
	System.out.println(z4.substring(0, secBlind +1));
	
	
	int i = 1;
	int z = 5;
	int g = i+z;
	int s = g-z;
	float r = z/i;
	double o = g*s;
	int p = g%3;
	System.out.println(i + z + g + s + r + o+ " " + " "+ p);
	/*
	int a = 5;
	int b = 5;
	System.out.println(a && b);
	System.out.println(a || b);
	System.out.println(a!= b && a > b);
	int a = 15;
	int b = 5;
	System.out.println(a<b ? a : b); //zwraca mniejsza wartoœæ */
	System.out.println(7/3f); //konwertuje niejawnie
	System.out.println(7/3); 
	double x = 5.0f; //konwertuje z wiêkszej wartoœci na mniejsz¹, zarezerwowa³
	// wiêcej miejsca, u¿ywa mniej z double na float, albo z int na float, np. float g = 5; a nie z float na double
/*
	char letter1 = 't';
	char letter2 = 'g';
	char letter3 = 'z';
	System.out.println(letter1+letter2+letter3);
	System.out.println("" + letter1+letter2+letter3);
	letter1++;letter2++;letter3++;
	System.out.println("" + letter1+letter2+letter3); 

	int b = 5;
	double c = 13.5;
	int d = (int)c/b;
	System.out.println(o.getClass().get.name()); */
			


	
	
}
}

