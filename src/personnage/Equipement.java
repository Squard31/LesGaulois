package personnage;

public enum Equipement 

{CASQUE("casque"),BOUCLIER("boucliers");
	
private String nom;

private Equipement(String nom)
{
	this.nom = nom;
}

public String toString()
{
		return nom;
}


}