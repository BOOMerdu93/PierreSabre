package personnages;

public class Humain {
	private String nom;
	private String BoissonFavorite;
	private int argent;

	public Humain(String nom, String BoissonFavorite, int argent) {
		this.nom = nom;
		this.BoissonFavorite = BoissonFavorite;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}
	
	public String getBoissonFavorite()
	{
		return BoissonFavorite;
	}
	
	public void parler(String texte)
	{
		System.out.println(texte);
	}
	
	
	public void direBonjour(String nom, String BoissonFavorite)
	{
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du "+ BoissonFavorite);
	}
	
	public void boire(String BoissonFavorite)
	{
		parler("Mmmmm, Un bon verre de " + BoissonFavorite + " ! Gloups !");
	}
	
	public void gagnerArgent(int gain)
	{
		argent += gain;
	}
	
	public void perdreArgent(int perte)
	{
		argent -= perte;
	}
	
	public void acheter(String bien, int prix)
	{
		if (prix > argent)
		{
			parler("Je n'ai plus que " + argent + " en poche, je ne peux pas m'offrir" + bien + " à "+ prix + " sous");
		}
		else
		{
			parler("J'ai "+ argent + " sous en poche. Je vais pouvoir m'offrir" + bien + " à " +prix+ " sous.");
			perdreArgent(prix);
		}	
	}
	
}
