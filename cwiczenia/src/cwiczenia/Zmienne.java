package cwiczenia;

public class Zmienne {

	public static void main(String[] args) {
		int t = 0;
		double m = 8.98;
		float d = 4.7f;
		boolean h = true;
		String name = "Michal"; //41str prezentacji, StringBuffer metoda dla stringow
		int i = 10;
		int l = 5;
		float g = 5.6f;
		double k = 4.3;
		l = i;
		i = 4;
		g = 7.8f;
		k = g;
		System.out.println(i + " "+ l + " " +g+ " " + k); //+ konkatencja
		System.out.println(h + " " + name);
		
		final int S = 8; //zmienna sta³a S = 5; zwraca b³¹d, bez deklaracji zmienna wyrzuca b³¹d

		String dane = "Nowa Stara zmienna do dzielenia to: ";
		String siema = "Siemka";
		String dane2 = dane.substring (5, 10);
		System.out.println(dane2 + " " + siema);  //wycinanie fragmentu zmiennej, indeks od 0 jak w tablicach
		char j = siema.charAt(3);  //deklarujemy jak¹ zmienn¹ nam zwróci metoda
		System.out.println(j);
		System.out.println(siema.toLowerCase());
		String siema_low = siema.toLowerCase();  //jeœli chcemy mieæ dostêp do zmiennej musimy zadeklarowaæ jakiego bêdzie typu
		System.out.println(siema.replace("mka"," ma"));
		StringBuffer buffer = new StringBuffer(dane); //nie do koñca zrozumia³e, Miruœ!!! 
		buffer.append("nowe metody klasy string");
		System.out.println(dane);
		System.out.println(buffer);  //
		String nowy = buffer.toString(); //buffer nie wywo³uje z automatu stringa
	}

}
