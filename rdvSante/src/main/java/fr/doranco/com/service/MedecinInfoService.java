package fr.doranco.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.doranco.com.dao.MedecinInfoDao;
import fr.doranco.com.model.MedecinInfo;

@Service
public class MedecinInfoService {
@Autowired
 private MedecinInfoDao medecinInfoDao;

public List<MedecinInfo> rechercherSpecialite(String specialite){
	List<MedecinInfo> medecins=new ArrayList<>();
	for(MedecinInfo medecin:medecinInfoDao.findAll())
	{
		if(medecin.getSpecialite().equals(specialite))
			medecins.add(medecin);
	}
	
	return medecins;
	
} 
public List<MedecinInfo> rechercherParAdresse(String code){
	List<MedecinInfo> medecins=new ArrayList<>();
	for(MedecinInfo medecin:medecinInfoDao.findAll())
	{
		if(medecin.getUtilisateur().getAdresse().getCodePostal().equals(code))
			medecins.add(medecin);
	}
	
	return medecins;
	
} 
	
	

}
