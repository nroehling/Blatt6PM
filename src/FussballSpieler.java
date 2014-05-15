
public class FussballSpieler extends Spieler {
	
	private int geschosseneTore;

	public FussballSpieler(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void schiessTor() {
		this.geschosseneTore++;
	}
	
	public int anzahlGeschosseneTore(){
		return geschosseneTore;
	}
}
