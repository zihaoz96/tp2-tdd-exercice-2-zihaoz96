package exo2;

public class ConvertisseurRomainEntier {
	public int getResultat(String valeur) {
		if (valeur == "I") {
			return 1;
		}else if (valeur == "V") {
			return 5;
		}else if (valeur == "X") {
			return 10;
		}
		
		return 0;	
	}
}
