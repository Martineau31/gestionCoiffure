package com.inti.entites;

import java.sql.Date;

public class Ferme {
 private Long id;
 private String nom;
 private Date dateAchat;
 
public Ferme() {
	super();
}
public Ferme(String nom, Date dateAchat) {
	super();
	this.nom = nom;
	this.dateAchat = dateAchat;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public Date getDateAchat() {
	return dateAchat;
}
public void setDateAchat(Date dateAchat) {
	this.dateAchat = dateAchat;
}
@Override
public String toString() {
	return "Ferme [id=" + id + ", nom=" + nom + ", dateAchat=" + dateAchat + "]";
}
 
}
