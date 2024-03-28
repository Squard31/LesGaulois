package personnage;

import java.util.Iterator;

public class Village 
{
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private int nbVillageoisMaximum;
	private Chef chef;
	
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
		return villageois[numeroVillageois];	
	}
	
	
	public void setChef(Chef chef) 
	{
		this.chef = chef;
	}

	
	public void afficherVillageois ()
	{
		System.out.println("Dans village vivent les l�gendaires Gaulois : " + chef.getNom());
		for (int i = 0 ; i < nbVillageois ; i++)
		{
			System.out.println(villageois[i].getNom());
		}
	}
	
	
	public static void main(String[] args)
	{
		Village village = new Village("Village des irr�ductibles",30);
		
		// Gaulois gaulois = village.trouverHabitant(30);
		// Car on a village de maximum 30 place et comme un tableau part de 0, alors le 30 correspond au 31�me
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
		
		// Gaulois gaulois = village.trouverHabitant(1);
		// System.out.println(gaulois);
		// Car quand on ajoute le premier villageois il se met � l'indice 0 et pas l'indice 1
		
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		
		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		
		village.afficherVillageois();
	}
	
}
