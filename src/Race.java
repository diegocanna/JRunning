import java.util.ArrayList;

public class Race {
	private String name;
	private	int max;
	private Organizer organizer;
	private ArrayList<Athlete> athletes=new ArrayList<Athlete>();
	
	public Race(String name, int max, Organizer organizer) {
		this.name=name;
		this.max=max;
		this.organizer=organizer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Organizer getOrganizer() {
		return organizer;
	}

	public void setOrganizer(Organizer organizer) {
		this.organizer = organizer;
	}

	public ArrayList<Athlete> getAthletes() {
		return athletes;
	}

	public void addAthletes(Athlete a) {
		if(athletes.size()<max) {
			athletes.add(a);
		}else {System.out.println("Numero massimo di partecipanti raggiunto");}
	}
	
	public void outAthletes() {
		System.out.println("La gara è: "+getName()+" organizzata da: "+getOrganizer().getName()+ " "+getOrganizer().getLastName());
		for(int i=0;i<athletes.size();i++) {
			System.out.println("Atleta: "+athletes.get(i).getName()+" Tempo: "+athletes.get(i).getTimes());
		}
	}
	
	public void outWinners() {
		Athlete winner=athletes.get(0);
		for(int i=0;i<athletes.size();i++) {
			if(winner.getTimes()>athletes.get(i).getTimes()) {
				winner=athletes.get(i);
			}
		}
		System.out.println("Il vincitore è "+winner.getName()+" "+winner.getLastName());
	}
	
	
}
