package personnage;

public class Gaulois 
{
	private String nom;
	private int force;
	private int nbTrophee;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];
	
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
		return ("Le gaulois " + nom + " : ");
	}
	
	public void frapper(Romain romain) 
	{
		int forceCoup = force / 3 * effetPotion;
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(forceCoup);
	}

	
//	@Override	
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
	
	
	// METHODE faireUneDonnation
	
	public void faireUneDonnation(Musee musee)
	{
		if (nbTrophee > 0)
		{
			System.out.println("Le gaulois : " + nom + "Je donne au musee tous mes trophees : ");
			
			for (int i = 0 ; i < nbTrophee ; i++)
			{
				musee.donnerTrophees(this, trophees[i].getEquipement());
				trophees[i] = null;
			}
			nbTrophee = 0;
		}
		else
		{
			System.out.println("Le gaulois : " + nom + "Je donne au musee tous mes trophees : ");
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		Gaulois asterix = new Gaulois("asterix", 8);
		System.out.println(asterix);
		
		asterix.parler("Je suis Asterix et je peux parler");
		
	}
	
}
