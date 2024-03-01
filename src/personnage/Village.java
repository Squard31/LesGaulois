package personnage;

public class Village 
{
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	
	// Constructeur de Village
	public Village(String nom, int nbVillageoisMaximum) 
	{
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	// Pour retourner le nom
	public String getNom() 
	{
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois)
	{
		if (nbVillageois < nbVillageoisMaximum)
		{
			villageois[nbVillageois] = gaulois;
			nbVillageois = nbVillageois + 1;
		}
		else
		{
			System.out.println("On a atteint le maximum de perosnne dans le village");
		}
	}
	
	
	public Gaulois trouverHabitant(int numeroVillageois)
	{
		if (numeroVillageois < nbVillageoisMaximum)
		{
			return villageois[numeroVillageois];
		}
		else
		{
			System.out.println("Village plein !");
		}
		
	}
	
	
	public void main(String[] args)
	{
		
	}
	
}
