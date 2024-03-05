package personnage;

public class Gaulois 
{
	private String nom;
	private int force, nbTrophees;
	private int effetPotion = 1;
	private Equipement trophees[] = new Equipement[100];
	
	public Gaulois (String nom, int force) 
	{
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() 
	{
		return nom;
	}
	
	public void parler(String texte) 
	{
		System.out.println(prendreParole() + " << " + texte + " >> ");
	}
	
//	private String prendreParole() 
//	{
//		return("Le Gaulois " + nom + " : ");
//	}
	
	private String prendreParole() 
	{
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}
	
//	public void frapper(Romain romain) 
//	{
//		int forceCoup = force / 3 * effetPotion;
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup(forceCoup);
//	}
	
	public void frapper(Romain romain) 
	{
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		
		for (int i = 0; trophees != null && i < trophees.length; i++,nbTrophees++) 
		{		
		this.trophees[nbTrophees] = trophees[i];
		}
		return;
	}

	
	@Override	
	public String toString() 
	{
		return ("Gaulois [nom = " + nom + ", force = " + force + ", effetPotion = " + effetPotion + "]");
	}
	
	public void boirePotion(int forcePotion)
	{
		effetPotion = effetPotion + forcePotion ;
		parler(" Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée ");
	}
	
	public int getForce()
	{
		return force;
	}
	
	
	public static void main(String[] args) 
	{
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		
		asterix.parler("Je suis Asterix et je peux parler");
		
	}
	
}
