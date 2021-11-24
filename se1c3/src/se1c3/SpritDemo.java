package se1c3;

public class SpritDemo {

	public static void main(String[] args) {
		KfzV0 minivan = new KfzV0();
		minivan.sitze = 6;
		minivan.tankInhalt = 70;
		minivan.verbrauch = 14;
		System.out.println("Minivan Verbrauch: " +minivan.spritVerbrauch(252) +"Liter");
		
		KfzV0 sportwagen = new KfzV0();
		sportwagen.sitze = 2;
		sportwagen.tankInhalt = 45;
		sportwagen.verbrauch = 11;
		System.out.println("Sportwagen Verbrauch: " +sportwagen.spritVerbrauch(252) +"Liter");

	}

}
