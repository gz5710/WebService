/**
 * 
 */
package com.model;

/**
 * @author Bruce GONG
 *
 */
public class UserInfo {
	private String Nom;
	private String SSN;
	private Address Adresse;
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public Address getAdresse() {
		return Adresse;
	}
	public void setAdresse(Address adresse) {
		Adresse = adresse;
	}
	
	
}
