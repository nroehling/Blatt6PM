
public class Main {

	public static void main(String [] args) {
		Mannschaft<FussballSpieler> elf = new Mannschaft<>("AllStars");
		elf.aufnehmen(new FussballSpieler("Ronaldo"));
		elf.aufnehmen(new FussballSpieler("Messi"));
		elf.ausgeben();
		
		Mannschaft<BasketballSpieler> bball = new Mannschaft<>("Chicago Bulls");
		bball.aufnehmen(new BasketballSpieler("Jordan"));
		bball.ausgeben();
		
		BundesLiga<Mannschaft<FussballSpieler>> bl = new BundesLiga<>();
		bl.addTeam(elf);
		bl.ausgeben();
		
		
	}
}
