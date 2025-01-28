
public class Main {

	public static void main(String[] args) {
		Organizer o1=new Organizer("Fabio","Briatore");
		Athlete a1=new Athlete("Michael","Schumacher","f1",147);
		Athlete a2=new Athlete("Charles","Leclerc","f1",149);
		Athlete a3=new Athlete("Lewis","Hamilton","f1",148);
		Race r1=new Race("Mugello",10,o1);
		r1.addAthletes(a1);
		r1.addAthletes(a2);
		r1.addAthletes(a3);
		r1.outAthletes();
		r1.outWinners();
	}

}
