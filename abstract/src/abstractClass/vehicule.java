package abstractClass;

public abstract class vehicule {

	String nom;
	String marque;
	
	public vehicule(String nom, String marque) {
		this.nom = nom;
		this.marque= marque;
	}
	
	public abstract void demarrer();
	public void avancer() {
		System.out.println("appuyer sur le champignon");
	};
}
