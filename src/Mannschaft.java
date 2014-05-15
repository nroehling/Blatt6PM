import java.util.ArrayList;


public class Mannschaft <S> { 
	
	private String name;
	private ArrayList<S> sList = new ArrayList<>();
	
	public Mannschaft(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void aufnehmen(S spieler) {
		sList.add(spieler);
	}
	
	public void rauswerfen(Spieler spieler) {
		
	}
	
	public void auswechseln(Spieler alt, Spieler neu) {
		
	}
	
	public void ausgeben() {
		System.out.println("Kader:" + "\n");
			for(S s : sList) {
				System.out.println(((Spieler) s).getName());
			}
		System.out.println("\n");
	}
	
}
