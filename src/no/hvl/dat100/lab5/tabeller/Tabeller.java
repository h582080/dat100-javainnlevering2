package no.hvl.dat100.lab5.tabeller; 

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
	
		for (int i = 0; i<tabell.length; i++) {
			
			System.out.println(tabell[i]);
		}
		

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
	    System.out.print("[");
		for (int i = 0 ; i < tabell.length; i++) {
			
	    	System.out.print(tabell[i] + ",");
	    }
		System.out.print("]");
		
		return "";
		
	}
		
	// c)
	public static int summer(int[] tabell) {

		
		int sum = 0;
		
		for (int i = 0; i<tabell.length; i++ ) {
			sum = tabell[i] + sum;		
		}
		return sum;
			
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		
		int pos = 0;
		boolean funnet = false;
		
		while (!funnet && pos< tabell.length) {
			if (tall == tabell[pos]) {
				funnet = true;
			}
		pos++;
		}
		return funnet;
	}
	

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		
		
		if (tabell[0] == tall) {
			return tabell[0] + tall;
		}
		else {
			return -1;
	}
}
	// f)
	public static int[] reverser(int[] tabell) {
		
		for(int i = 0; i < tabell.length / 2; i++)
		{
		    int temp = tabell[i];
		    tabell[i] = tabell[tabell.length - i - 1];
		    tabell[tabell.length - i - 1] = temp;		    
		}
		return tabell;

	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		// TODO
	    throw new UnsupportedOperationException("erSortert ikke implementert");
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
	    throw new UnsupportedOperationException("settSammen ikke implementert");		
	}
}