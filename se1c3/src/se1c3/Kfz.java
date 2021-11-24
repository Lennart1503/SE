package se1c3;

public class Kfz {
	private int sitze;
	private int tankInhalt;
	protected float verbrauch;


		public Kfz(int sitze, int tankInhalt, float verbrauch) {
			this.sitze = sitze;
			this.tankInhalt = tankInhalt;
			this.verbrauch = verbrauch;
		}
		
		public float reichweite() {
			float reichweite = tankInhalt / verbrauch * 100;
			return reichweite;
		}
		
		public float spritVerbrauch(int km) {
			float spritVerbrauch = verbrauch / 100 * km; 
			return spritVerbrauch;
		}
}
