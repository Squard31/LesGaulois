package personnage;

public class Trophee 
{
	// ATTRIBUTS
	private Gaulois gaulois;
	private Equipement equipement;
	
	// CONSTRUCTEUR
	
	public Trophee (Gaulois gaulois, Equipement equipement)
	{
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	// LES GUETTEURS
	
	
	// METHODE "getGaulois"
	
	public Gaulois getGaulois()
	{
		return gaulois;
	}
	
	
	// METHODE "getEquipement"
	
	public Equipement getEquipement()
	{
		return equipement;
	}
	
	
	// METHODE donnerNom
	
	public String donnerNom(Gaulois gaulois)
	{
		 return gaulois.getNom();	
	}
	
}


