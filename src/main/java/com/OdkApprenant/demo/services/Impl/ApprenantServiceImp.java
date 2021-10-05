package com.OdkApprenant.demo.services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.OdkApprenant.demo.exception.RessourceNotFoundException;
import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
import com.OdkApprenant.demo.services.ApprenantService;

import lombok.AllArgsConstructor;
import lombok.Data;
@Service
//@Data
//@AllArgsConstructor

public class ApprenantServiceImp implements ApprenantService{

	private ApprenantRepository apprenantRepository; 
	
	public ApprenantServiceImp(ApprenantRepository apprenantRepository) {
		super();
		this.apprenantRepository = apprenantRepository;
	}
	public Apprenant saveApprenant(Apprenant apprenant) {
		return apprenantRepository.save(apprenant);
	}
	
	
	
	
	
	public List<Apprenant> getAllApprenants() {
		return apprenantRepository.findAll();
	}
	public Apprenant getApprenantById(long id) {
	Optional<Apprenant>  apprenant = apprenantRepository.findById(id);
	
		if (apprenant.isPresent()) {
			return apprenant.get();
		}
		else {
			throw new RessourceNotFoundException("Apprenant", "Id", id);
		}
		
	}
	public Apprenant UpdateApprenant(Apprenant apprenant, long id) {
		Apprenant updateApprenant = apprenantRepository.findById(id).orElseThrow(
	() -> new  RessourceNotFoundException("Apprenant", "id", id));
				
		updateApprenant.setNom(apprenant.getNom());
		updateApprenant.setPrenom(apprenant.getPrenom());
		updateApprenant.setAge(apprenant.getAge());
		updateApprenant.setTelephone(apprenant.getTelephone());
		updateApprenant.setEmail(apprenant.getEmail());
		updateApprenant.setLogin(apprenant.getLogin());
		updateApprenant.setPassword(apprenant.getPassword());
		updateApprenant.setGenre(apprenant.getGenre());
		updateApprenant.setApprenantStatus(apprenant.getApprenantStatus());
		updateApprenant.setDateCreation(apprenant.getDateCreation());
		updateApprenant.setDateModification(apprenant.getDateModification());
		
		apprenantRepository.save(updateApprenant);
		return updateApprenant;
	}
	@Override
	public void deleteApprenant(long id) {
		apprenantRepository.findById(id).orElseThrow(
				() -> new RessourceNotFoundException("Apprenant", "id", id));
		
		apprenantRepository.deleteById(id);
		
	}

}
