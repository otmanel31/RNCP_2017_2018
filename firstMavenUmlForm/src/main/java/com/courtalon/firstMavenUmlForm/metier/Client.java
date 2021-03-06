package com.courtalon.firstMavenUmlForm.metier;
/**
 * 
 * @startuml com/courtalon/firstMavenUmlForm/metier/sequence1.png
 * 
 * App -> Client : getSolde()
 * activate Client
 * App <-- Client : return solde
 * deactivate Client
 * 
 * @enduml
 * 
 */

/**
 * <img alt="sequence1" src="sequence1.png">
 * <p>
 * classe representant un client avec le solde de son compte
 * </p>
 * @author Vincent COURTALON
 * 
 */
public class Client {
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private double solde;
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public double getSolde() {return solde;}
	public void setSolde(double solde) {this.solde = solde;}


	public Client(int id, String nom, String prenom, String email, double solde) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.solde = solde;
	}

	
}
