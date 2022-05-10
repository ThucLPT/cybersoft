public class Rank {
	private String name;
	private int attempt;

	public Rank(String name, int attempt) {
		this.name = name;
		this.attempt = attempt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}
}
