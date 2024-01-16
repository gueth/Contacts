package repertoire.model;

public class Personne {
	
	//attribus
	private String nom;
	private String prenom;
	
	//constructeur
	public Personne(String n,String p) {
		this.nom=n;
		this.prenom=p;
	}
	

	//getters et setters
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	//getters et setters fin


	@Override
	public String toString() {
		return  nom+" "+prenom ;
	}
	
	

}
