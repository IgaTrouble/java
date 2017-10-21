package petle_day2;

public class Loop_while {

	public static void main(String[] args) {
	int i = 0;
	while(i<10) {
		i++; 
		System.out.println("Drukuje mi coœ razy " + i);
	}

	do {
		System.out.println("Petla sie wykona");
	}while(false);
	

	do {
		System.out.println("Petla sie wykona bo");
		i--;
	}while(i>=10);
	
	int y = 0;
	while(true) {
		y++;
		System.out.println("jesteœmy w pêtli");
		if(y<2) {
			System.out.println("contuniue");
			continue;
		}
		else if(y>=2 && y<5) {
			System.out.println("y>=2 && y<5");
	}
		else {
		break;
		}
	}
	
	for(;;) {
		break;
	}
	
	}

	
	
}
