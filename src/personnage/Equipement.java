package personnage;

public enum Equipement
{

	CASQUE("casque"), BOUCLIER("bouclier");
	
	private String nom ;

	private Equipement(String nom) 
	{
		this.nom = nom;
	}
	
	public String toString ()
	{
		return nom;
	}

	public String getNom()
	{
		return nom;
	}

	public Equipement getEquipement() 
	{
		return this;
	}
	
}