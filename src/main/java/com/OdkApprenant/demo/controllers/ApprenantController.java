package com.OdkApprenant.demo.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantService;

@RestController
@RequestMapping("/api/apprenants")
public class ApprenantController {

		private ApprenantService  apprenantService;

		public ApprenantController(ApprenantService apprenantService) {
			super();
			this.apprenantService = apprenantService;   
		}
		@PostMapping()
		public ResponseEntity<Apprenant> saveApprenant(@RequestBody Apprenant apprenant){
			return new ResponseEntity<Apprenant>(apprenantService.saveApprenant(apprenant),HttpStatus.CREATED);
		}
		@GetMapping
		public List<Apprenant> getAllApprenants(){
			return apprenantService.getAllApprenants();
			
		}
		@GetMapping("{id}")
		public  ResponseEntity<Apprenant> getApprenantById(@PathVariable("id")long apprenantId){
			return new ResponseEntity<Apprenant>(apprenantService.getApprenantById(apprenantId), HttpStatus.OK);
			
		}
		@PutMapping("{id}")
		public ResponseEntity<Apprenant> updateApprenant(@PathVariable("id") long id,
														 @RequestBody Apprenant apprenant){
			return new ResponseEntity<Apprenant>(apprenantService.UpdateApprenant(apprenant, id), HttpStatus.OK);
			
		}
		@DeleteMapping("{id}")
		public ResponseEntity<String> deleteApprenant(@PathVariable("id") long id ){
			apprenantService.deleteApprenant(id);
			return new ResponseEntity<String>("Apprenant supprimer avec succes.", HttpStatus.OK);
			
		}
}
