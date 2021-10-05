package com.OdkApprenant.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourceNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ressourceName;
	private String fieldName;
	private Object fiedValue;
	
	
	public RessourceNotFoundException(String ressourceName, String fieldName, Object fiedValue) {
		super(String.format("%s not fund with %s : '%s'", ressourceName, fieldName, fiedValue));
		this.ressourceName = ressourceName;
		this.fieldName = fieldName;
		this.fiedValue = fiedValue;
	}

	public String getRessourceName() {
		return ressourceName;
		
	} 
	public String getfiedName() {
		return fieldName;
		
	} 
	public Object getfieldValue() {
		
		return fiedValue;
		
	} 
}
