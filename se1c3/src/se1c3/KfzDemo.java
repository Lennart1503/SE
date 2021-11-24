package se1c3;

public class KfzDemo {

	public static void main(String[] args) {
		KfzV0 minivan = new KfzV0();
		minivan.sitze = 6;
		minivan.tankInhalt = 70;
		minivan.verbrauch = 14;
		System.out.println("Minivan Reichweite: " +minivan.tankInhalt/minivan.verbrauch *100);
		
		

	}

}
