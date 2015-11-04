/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.UtilisateurDAO;
import forum.entity.Utilisateur;
import forum.entity.Utilisateur.Etat;
import forum.exception.UtilisateurException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class UtilisateurService {
    
    @Autowired
    private UtilisateurDAO dao;
    
    @Transactional
    public void insert(Utilisateur utilisateur) {
        dao.save(utilisateur);
    }
    
    @Transactional
    public void delete(Long idUtilisateur) {
        dao.delete(idUtilisateur);
    }
    
    @Transactional
    public void deleteAll() {
        dao.deleteAll();
    }
    
    @Transactional
    public void update(Utilisateur utilisateur) {
        dao.save(utilisateur);
    }
    
    public Utilisateur find(Long idUtilisateur) {
        return dao.findOne(idUtilisateur);
    }
    
    public Iterable<Utilisateur> findAll(){
        return dao.findAll();
    }
    
    public void inscription(String login, String mdp){
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setLogin(login);
        utilisateur.setMdp(mdp);
        utilisateur.setType(Utilisateur.Type.UTIL);
        
        dao.save(utilisateur);
    }
    
    public void validationInscription(Long idUtilisateur) {
        Utilisateur utilisateur = find(idUtilisateur);
        utilisateur.setEtat(Etat.ACTIF);
        
        dao.save(utilisateur);
    }
    
    public void login(String login, String mdp) throws UtilisateurException{
        Utilisateur utilisateur = dao.findOneByLoginAndMdp(login, mdp);
        
        if(utilisateur == null)
            throw new UtilisateurException("Utilisateur non trouvé dans la base de données.");
        else if(utilisateur.getEtat() == Etat.INACTIF)
            throw new UtilisateurException("Utilisateur non actif.");
        else
            System.out.println("Félicitations vous vous êtes connecté !");
            
    }
}
