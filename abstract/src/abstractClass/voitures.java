package abstractClass;

public abstract class voitures {
	String nom = "renaud";
	String marque = "twingo";

	public void activerAirBags() {
		System.out.println("methode propre a moto uniquement");
	}

	@Override
	public void demarrer() {
		System.out.println("verifier q'on est au point mort, appuyer sur l'embrayage et tourner la clef");
	}
}
