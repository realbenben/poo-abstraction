package abstractClass;

//classe fille

 class motos extends vehicule {
	String nom="ma moto";
	String marque="kawasaki";
	
	public void mettreLaBequille() {
		System.out.println("methode propre a moto uniquement");
	}
//@override sert ici a ecraser la methode vide et a la reecrire pour la classe motos
	
	@Override
	public  void demarrer() {
		System.out.println("tourner la clef et mettre un coup de kick");
	}
}
