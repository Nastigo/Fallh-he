
import Prog1Tools.IOTools;
public class Fall {

	public static void main(String[] args) {
		double ah, rhp, rhm;  //ah-ausgangsh�he, rrhp-resth�he in %, rhm -resth�he in meter
		int bk; // bk-anzahl der bodenkontakte
		int i; //Z�hlvariable deklarieren
		
		ah=IOTools.readDouble("Ausgangsh�he: ");
		rhp=IOTools.readDouble("Resth�he in %: ");
		bk=IOTools.readInteger("Anzahl der Bodenkontakte: ");
		
		i=1;
		
		do {
			rhm=ah*rhp/100;
			System.out.printf("Ausgangsh�he: ");
			System.out.printf("%10.2f",ah);
			System.out.printf("  ");
			System.out.printf("Resth�he ");
			System.out.printf("%10.2f",rhm);
			//Zeilenumbruch
			System.out.println();
			ah=rhm;
			i++; //i=i+1
		}

		while(i<=bk); //solange Bedienung erf�llt bleibe in die Schleife
			
	}

}
