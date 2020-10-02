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
		
	    String str = "[";
	    
	    for (int i = 0; i < tabell.length; i++) {
	    	str = str + tabell[i];
	    	
	    	if (i <tabell.length - 1) {
	    		str = str + ",";
	    	}
	    }
	    
	    str = str + "]";
	    
	    return str;
		
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

		int posisjon = -1;
		int i =0;
		
		while (i <tabell.length && (posisjon ==-1)) {
			if (tabell[i] == tall) {
				posisjon = i;
			}
			
			i++;
			
		}
		
		return posisjon;
		
		
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
		
		int lengde = tabell.length;
		boolean sortert = true;

		int i = 0;
		while ((i < lengde - 1) && sortert) {

			if (!(tabell[i] <= tabell[i + 1])) {
				sortert = false;
			}
			i++;
		}

		return sortert;
		
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;

		int[] nytabell = new int[lengde1 + lengde2];

		for (int i = 0; i < lengde1; i++) {
			nytabell[i] = tabell1[i];
		}

		for (int i = 0; i < lengde2; i++) {
			nytabell[lengde1 + i] = tabell2[i];
		}

		return nytabell;	
	}
}