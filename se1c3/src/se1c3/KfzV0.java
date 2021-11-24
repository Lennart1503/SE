package se1c3;

public class KfzV0 {
public int sitze;
public int tankInhalt;
public float verbrauch;


	public static void main(String[] args) {
		

	}
	
	public int reichweite() {
		int reichweite = tankInhalt / (int)verbrauch * 100;
		return reichweite;
	}
	
	public float spritVerbrauch(int km) {
		float spritVerbrauch = verbrauch / 100 * km; 
		return spritVerbrauch;
	}
}
