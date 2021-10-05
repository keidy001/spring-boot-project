package com.OdkApprenant.demo.model;
import com.OdkApprenant.demo.model.ApprenantStatus;

import java.time.LocalDate;
import javax.persistence.Id;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.Table;
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
//@Table(name = "Apprenants") 
public class Apprenant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long 	id;
	private String 		nom;
	private String 		prenom;
	private Integer 	age;
	private Integer 	telephone;
	private String  	email;
	private String  	login;
	private String 		password;
	private String 		genre;
	@Enumerated(EnumType.STRING)
	private ApprenantStatus		apprenantStatus;
	private LocalDate	dateCreation;
	private LocalDate	dateModification;
	
	
	public Apprenant() {
		super();
	}

	
	public Apprenant(String nom, String prenom, Integer age, Integer telephone, String email, String login,
			String password, String genre, ApprenantStatus apprenantStatus, LocalDate dateCreation, LocalDate dateModification) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.telephone = telephone;
		this.email = email;
		this.login = login;
		this.password = password;
		this.genre = genre;
		this.apprenantStatus = apprenantStatus;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public  ApprenantStatus getApprenantStatus() {
		return apprenantStatus;
	}
	public void setApprenantStatus(ApprenantStatus apprenantStatus) {
		this.apprenantStatus = apprenantStatus;
	}
	public LocalDate getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(LocalDate dateCreation) {
		this.dateCreation = dateCreation;
	}
	public LocalDate getDateModification() {
		return dateModification;
	}
	public void setDateModification(LocalDate dateModification) {
		this.dateModification = dateModification;
	}
	
	
}
