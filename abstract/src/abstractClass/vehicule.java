package abstractClass;

//ici la classe abstract vehicule ou l'on initie les parametres generaux utilise pour les classes filles 

public abstract class vehicule {

	String nom;
	String marque;
	
	public vehicule(String nom, String marque) {
		this.nom = nom;
		this.marque= marque;
	}
//	ici on initie la classe vide qu on viendra modif dans les classes filles 
	public abstract void demarrer();
	public void avancer() {
		System.out.println("appuyer sur le champignon");
	};
}
