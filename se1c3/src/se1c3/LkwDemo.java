package se1c3;

public class LkwDemo {

	public static void main(String[] args) {
		Kfz sportWagen = new Kfz(2,45,11);
		Lkw magirus = new Lkw(2,45,11,100,true);
		
		System.out.println("Sportwagen Reichweite: " + sportWagen.reichweite() + "km");
		System.out.println("Sportwagen Verbeuach: " + sportWagen.spritVerbrauch(252) + " Liter");
		System.out.println();
		System.out.println("LKW Reichweite: " + magirus.reichweite() + "km");
		System.out.println("LKW Verbeuach: " + magirus.spritVerbrauch(252) + " Liter");
	}

}
