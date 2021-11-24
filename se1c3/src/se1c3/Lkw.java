package se1c3;

public class Lkw extends Kfz {
	public int ladeFlaeche;
	public boolean hatAnhaenger;

	public Lkw(int sitze, int tankInhalt, float verbrauch, int ladeFlaeche, boolean hatAnhaenger) {
		super(sitze, tankInhalt, verbrauch);
		this.ladeFlaeche = ladeFlaeche;
		this.hatAnhaenger = hatAnhaenger;
		
	}

	public float spritVerbrauch(int km) {
		float spritVerbrauch = ((verbrauch / 100) * km)+1; 
		return spritVerbrauch;
	
	}	
	
	public static void main(String[] args) {
		Lkw LKW = new Lkw(2,70,25,100,true);
		System.out.println("LKW Verbrauch: " + LKW.spritVerbrauch(250) + "Liter");

	}
}
