package abstractClass;

public abstract class motos {
	String nom="ma moto";
	String marque="kawasaki";
	
	public void mettreLaBequille() {
		System.out.println("methode propre a moto uniquement");
	}

	@Override
	public  void demarrer() {
		System.out.println("tourner la clef et mettre un coup de kick");
	}
}
