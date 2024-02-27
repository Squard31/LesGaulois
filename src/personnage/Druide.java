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
		parler("Bonjour, je suis la druide" + nom + "et ma potion peut aller d'une force" + effetPotionMin + "�" + effetPotionMax + ".");
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void parler(String texte) 
	{
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	public String prendreParole() 
	{
		return ("Le Druide" + nom + ":");
	}
	
	public void preparerPotion()
	{
		Random random = new Random();
		
		int forcePotion = random.nextInt(effetPotionMax - effetPotionMax + 1) + effetPotionMin;
		
		if (forcePotion > 7)
		{
			
		}
	}
	
}
