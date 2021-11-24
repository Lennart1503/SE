package se1c3;

public class ReturnDemo {

	public static void main(String[] args) {
		
		KfzV0 minivan = new KfzV0();
		minivan.sitze = 6;
		minivan.tankInhalt = 70;
		minivan.verbrauch = 14;
		minivan.reichweite();
		System.out.println("Minivan Reichweite: " +minivan.reichweite() +"km");
		
		KfzV0 sportwagen = new KfzV0();
		sportwagen.sitze = 2;
		sportwagen.tankInhalt = 45;
		sportwagen.verbrauch = 11;
		sportwagen.reichweite();
		System.out.println("Sportwagen Reichweite: " +sportwagen.reichweite() +"km");
		

	}

}
