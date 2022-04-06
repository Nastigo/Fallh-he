
import Prog1Tools.IOTools;
public class Fall {

	public static void main(String[] args) {
		double ah, rhp, rhm;  //ah-ausgangshöhe, rrhp-resthöhe in %, rhm -resthöhe in meter
		int bk; // bk-anzahl der bodenkontakte
		int i; //Zählvariable deklarieren
		
		ah=IOTools.readDouble("Ausgangshöhe: ");
		rhp=IOTools.readDouble("Resthöhe in %: ");
		bk=IOTools.readInteger("Anzahl der Bodenkontakte: ");
		
		i=1;
		
		do {
			rhm=ah*rhp/100;
			System.out.printf("Ausgangshöhe: ");
			System.out.printf("%10.2f",ah);
			System.out.printf("  ");
			System.out.printf("Resthöhe ");
			System.out.printf("%10.2f",rhm);
			//Zeilenumbruch
			System.out.println();
			ah=rhm;
			i++; //i=i+1
		}

		while(i<=bk); //solange Bedienung erfüllt bleibe in die Schleife
			
	}

}
