package personnage;

public class Romain 
{
	private String nom;
	private int force;
	private Equipement[] equipement = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) 
	{
		this.nom = nom;
		assert force > 0;
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

	private String prendreParole() 
	{
		return ("Le Romain " + nom + " : ");
	}

	public void recevoirCoup(int forceCoup) 
	{
		assert force > 0;
		force = force - forceCoup;
		if(force > 0) 
		{
			parler("Aie");
		} 
		else 
		{
			parler("J'abandonne...");
		}
		assert force < force + forceCoup;
	}
	
	public static void main (String[] args)
	{
		Romain cesar = new Romain ("Cesar", 5);
		
		cesar.prendreParole();
		cesar.parler("Je suis le gouverneur des Romains");
		
		cesar.recevoirCoup(4);
		
		Romain minus = new Romain("Minus",6);
		
		System.out.println(Equipement.CASQUE);
		System.out.println(Equipement.BOUCLIER);
	}
}
