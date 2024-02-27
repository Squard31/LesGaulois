package histoire;

import personnage.Gaulois;
import personnage.Romain;
import personnage.Druide;


public class Scenario {

	public static void main(String[] args) 
	{
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		
		Romain minus = new Romain ("Minus", 6);
		
		Druide panoramix = new Druide("Panoramix",5,10,1);
		
		panoramix.preparerPotion();
		
		System.out.println( "Le druide Panoramix : "); panoramix.booster(obelix);
		
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		
		 panoramix.booster(asterix);
		 
	     asterix.parler("Bonjour");

	     minus.parler("UN GAU... UN GAUGAU...");
	     
	     asterix.frapper(minus);
	     
	     minus.parler("J'abandonne...");
	}

}
