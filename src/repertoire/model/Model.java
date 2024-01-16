package repertoire.model;

import java.util.ArrayList;

import repertoire.view.Controller;


public class Model {

	
	// champs
	
	private Controller				controller;
	private ArrayList<Personne> personnes=new ArrayList <Personne>();
	private ArrayList<Adresse> adresses=new ArrayList<Adresse>();
	
	// Constructeur
	
	public Model( Controller controller ) {
		this.controller = controller;
		personnes.add(new Personne("ADAMS","John"));
		personnes.add(new Personne("DUPONT","Jean"));
		personnes.add(new Personne("SUAREZ","Maria"));
		controller.afficherPersonnes(personnes);
		
		adresses.add(new Adresse("31 Rue Picasso","31000", "Toulouse"));
		adresses.add(new Adresse("33 Rue Molière", "33000", "Bordeaux"));
		adresses.add(new Adresse("87 Place Churchill", "87000", "Limoges"));
		controller.afficherAdresses(adresses);
	}
	
	public void traiterSelectionPersonne( Personne personne ){
		if(personne!=null)controller.afficherPersonne(personne.getNom(), personne.getPrenom());
		else controller.afficherPersonne(null, null);
	}
	public void traiterSelectionAdresse( Adresse adresse ) {
		if(adresse!=null)controller.afficherAdresse(adresse.getRue(), adresse.getCode(), adresse.getVille());
		else controller.afficherAdresse(null, null, null);
	}
	
	
	
	public void modifierPersonne( Personne personne,String nom, String prenom ) {
		if(personne!=null) {
			if(personnes.contains(personne)) {
				personnes.get(personnes.indexOf(personne)).setNom(nom);
				personnes.get(personnes.indexOf(personne)).setPrenom(prenom);
			}
		}controller.afficherPersonnes(personnes);
		controller.afficherPersonne(null, null);
	}
	public void modifierAdresse( Adresse adresse, String rue, String codePostal, String ville ) {
		if(adresse!=null) {
			if(adresses.contains(adresse)) {
				adresses.get(adresses.indexOf(adresse)).setCode(codePostal);;
				adresses.get(adresses.indexOf(adresse)).setRue(rue);
				adresses.get(adresses.indexOf(adresse)).setVille(ville);
			}
		}controller.afficherAdresses(adresses);
		controller.afficherAdresse(null, null, null);
	}
	
	
	
	public void creerPersonne( String nom, String prenom ) {
		personnes.add(new Personne(nom,prenom));
		controller.afficherPersonnes(personnes);
		controller.afficherPersonne(null, null);
	}
	public void creerAdresse( String rue, String codePostal, String ville ) {
		adresses.add(new Adresse(rue,codePostal,ville));
		controller.afficherAdresses(adresses);
		controller.afficherAdresse(null, null, null);
	}
	
	
	
	
	
	
	public void supprimerPersonne( Personne personne ) {
		if(personne!=null&&personnes.contains(personnes))
			personnes.remove(personne);
			controller.afficherPersonnes(personnes);
			controller.afficherPersonne(null, null);
	}
	 public void supprimerAdresse( Adresse adresse ) {
		 if(adresse!=null&&adresses.contains(adresse))adresses.remove(adresse);
		 controller.afficherAdresses(adresses);
		 controller.afficherAdresse(null, null, null);
	 }
	// Actions
}
