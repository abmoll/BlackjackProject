
public class Player {

	String name;
	Hand hand;
	double wallet;
	int wins;

	public void placeWager(int wager) {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		
		this.wins = wins;
	}

	public Player(String name) {
		this.name = name;
	}

	public Player() {
		// TODO Auto-generated constructor stub
	}

	
}
