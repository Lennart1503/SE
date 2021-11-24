package se1c3;

public class ZweiKfz {

	public static void main(String[] args) {
		KfzV0 minivan = new KfzV0();
		minivan.sitze = 6;
		minivan.tankInhalt = 70;
		minivan.verbrauch = 14;
		System.out.println("Minivan Reichweite: " +minivan.tankInhalt/minivan.verbrauch *100 +"km");
		
		KfzV0 sportwagen = new KfzV0();
		sportwagen.sitze = 2;
		sportwagen.tankInhalt = 45;
		sportwagen.verbrauch = 11;
		System.out.println("Sportwagen Reichweite: " +sportwagen.tankInhalt/sportwagen.verbrauch *100 +"km");
	}

}
