package com.OdkApprenant.demo.services;

import java.util.List;

import com.OdkApprenant.demo.model.Apprenant;

public interface ApprenantService {
Apprenant saveApprenant(Apprenant apprenant);
List<Apprenant> getAllApprenants();
Apprenant getApprenantById(long id);
Apprenant UpdateApprenant(Apprenant apprenant, long id);
void deleteApprenant(long id);
}
