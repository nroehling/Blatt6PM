
public class BasketballSpieler extends Spieler {
	
	private int punkte;

	public BasketballSpieler(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {	
		return name;
	}
	
	public void wirfKorb() {
		this.punkte++;
	}
	
	public int erzieltePunkte() {
		return punkte;
	}
}
