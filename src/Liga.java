import java.util.ArrayList;


public abstract class Liga <M> {
	
	private ArrayList<M> mList = new ArrayList<>();
	
	public void addTeam(M team) {
		mList.add(team);
	}
	
	public void removeTeam(M team) {
		mList.remove(team);
	}

}
