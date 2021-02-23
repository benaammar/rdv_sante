package fr.doranco.com.dao;

import org.springframework.data.repository.CrudRepository;

import fr.doranco.com.model.Utilisateur;

public interface UtilisateurDao extends CrudRepository<Utilisateur, Long> {

}
