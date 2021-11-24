package se1c3;

public class KonstruktorDemo {
	
	
	public static void main(String[] args) {
		
		Kfz minivan = new Kfz(6,70,14);
		System.out.println("Minivan Verbrauch: " +minivan.spritVerbrauch(252) +"Liter");
		
		Kfz sportwagen = new Kfz(2,45,11);
		System.out.println("Minivan Verbrauch: " +sportwagen.spritVerbrauch(252) +"Liter");
	}

}
