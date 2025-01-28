
public class Athlete extends Person {
	private String category;
	private int times;
	
	public Athlete(String name, String lastName, String category, int times) {
		super(name,lastName);
		this.category=category;
		this.times=times;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getTimes() {
		return times;
	}

	public void setTimes(int times) {
		this.times = times;
	}
	

}
