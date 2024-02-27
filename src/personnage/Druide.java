package personnage;

import java.util.Random;

public class Druide 
{
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax, int forcePotion) 
	{
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.forcePotion = forcePotion;
		parler(" Bonjour, je suis la druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ". ");
	}
	
	// METHODE "getNom"
	public String getNom() 
	{
		return nom;
	}
	
	// METHODE "parler"
	public void parler(String texte) 
	{
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	// METHODE "prendreParole"
	public String prendreParole() 
	{
		return (" Le Druide " + nom + ":");
	}
	
	// METHODE "preparerPotion"
	public void preparerPotion()
	{
		Random random = new Random();
		
		int forcePotion = random.nextInt(effetPotionMax - effetPotionMax + 1) + effetPotionMin;
		
		if (forcePotion > 7)
		{
			parler(" Je vais aller préparer une petite potion... " + forcePotion);
		}
		else
		{
			parler(" Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois)
	{
		if (gaulois.getNom().equals("Obélix"))
		{
			System.out.println(" Non, Obélix !... Tu n’auras pas de potion magique ! ");
		}
		else
		{
			int forcePotion = (int) (Math.random() * (effetPotionMax - effetPotionMin + 1) + effetPotionMin);
            gaulois.boirePotion(forcePotion);
		}
	}
	
	// METHODE "Main"
	public static void main(String[] args)
	{
		Druide panoramix = new Druide("Panormaix",5,10,1);
		
		panoramix.preparerPotion();
	}
	
}
