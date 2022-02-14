package abstractClass;

//classe fille

class voitures extends vehicule {
	String nom = "renaud";
	String marque = "twingo";

	public void activerAirBags() {
		System.out.println("methode propre a moto uniquement");
	}
	//@override sert ici a ecraser la methode vide et a la reecrire pour la classe voitures
	
	@Override
	public void demarrer() {
		System.out.println("verifier q'on est au point mort, appuyer sur l'embrayage et tourner la clef");
	}
}
