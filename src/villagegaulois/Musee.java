package villagegaulois;

import personnage.Equipement;
import personnage.Trophee;
import personnage.Gaulois;

// CONSTRUCTEUR
public class Musee 
{
	private Trophee[] trophee = new Trophee[200];
	private int nbTrophees = 0;


// METHODE "donnerTrophees"
public void donnerTrophees(Gaulois gaulois, Equipement equipement) 
{
    if (nbTrophees < 200) 
    {
        Trophee nouveauTrophee = new Trophee (gaulois, equipement);
        trophee[nbTrophees] = nouveauTrophee;
        nbTrophees++;
        System.out.println(gaulois.getNom() + " a donné " + equipement + " au musée.");
    } 
    else 
    {
        System.out.println("Le musée est plein, nous ne pouvons pas accepter de nouveaux trophées pour le moment.");
    }
}
}
