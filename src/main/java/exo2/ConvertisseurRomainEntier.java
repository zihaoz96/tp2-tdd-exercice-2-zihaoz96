package exo2;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class ConvertisseurRomainEntier {
	
	public int getResultat(String valeur) {
		
		switch (valeur) {
		case "I":
			return 1;
			
		case "V":
			return 5;
			
		case "X":
			return 10;
			
		case "L":
			return 50;
			
		case "C":
			return 100;
			
		default:
			return 0;
		
		}
	}
}
