import java.util.ArrayList;


public class BundesLiga<M> extends Liga<M> {
	
	private ArrayList<M> tList = new ArrayList<>();
	
	@Override
	public void addTeam(M team) {
		tList.add(team);
	}

	@Override
	public void removeTeam(M team) {
		tList.remove(team);

	}

	public void ausgeben() {
		System.out.println("Bundesliga Mannschaften: " + "\n");
			for(M m : tList) {
				System.out.println(((Mannschaft) m).getName());
			}
	}
}
