/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.test;

import ch.qos.logback.classic.util.ContextInitializer;
import forum.entity.Message;
import forum.entity.Messageprive;
import forum.entity.Utilisateur;
import forum.entity.Utilisateur.Etat;
import forum.exception.UtilisateurException;
import forum.service.MessageService;
import forum.service.MessagepriveService;
import forum.service.SecurityService;
import forum.service.UtilisateurService;
import forum.spring.SpringConfig;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author ETY
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class ForumTest {
        
//    @Autowired
//    private UtilisateurDAO dao;
    
    @Autowired
    private UtilisateurService utilisateurService;
    
    @Autowired
    private MessageService messageService;
    
    @Autowired
    private MessagepriveService messagepriveService;
    
    @Autowired
    SecurityService securityService; 
    
    @Before
    //@Transactional
    public void setUp() {
//        //Supprime tous les films
//        dao.deleteAll();
//        
//        //Ajoute 2 films
//        dao.save(new Utilisateur("valoo86", "azerty", Utilisateur.Type.ADMIN, 1L));
        
        utilisateurService.deleteAll();
        //System.out.println("Résultat de adminVerifierAccess : "+securityService.adminVerifierAccess("titi"));
//        //utilisateurService.insert(new Utilisateur("valoo86", "aze", Utilisateur.Type.ADMIN, 1L));
//        utilisateurService.inscription("Damien61", "azerty");
//        utilisateurService.inscription("Valoo86", "azerty");
    }
    
    @Test
    public void testForum(){
//        Utilisateur utilisateur1 = utilisateurService.find(1L);
//        Utilisateur utilisateur2 = utilisateurService.find(2L);
//        
//        Message message1 = new Message("mon 1er message dans la db", utilisateur1, 1L);
//        Message message2 = new Message("mon 2ème message dans la db", utilisateur1, 2L);
//        Message message3 = new Message("mon 3ème message dans la db", utilisateur1, 3L);
//        
//        messageService.insert(message1);
//        messageService.insert(message2);
//        messageService.insert(message3);
//        
//        utilisateur1.getMessagesPostes().add(message1);
//        utilisateur1.getMessagesPostes().add(message2);
//        utilisateur1.getMessagesPostes().add(message3);
//        
//        utilisateurService.update(utilisateur1);
//        
////        System.out.println("nombre de messages = "+utilisateur1.getMessagesPostes().size());
//        Assert.assertEquals(3, utilisateurService.find(1L).getMessagesPostes().size());
//        utilisateurService.validationInscription(1L);
//        utilisateur1.setEtat(Etat.ACTIF);
//        
//        Messageprive messagePrive = new Messageprive("Secret", "Coucou mon lapin", 1L);
//        messagePrive.setEmetteur(utilisateur1);
//        messagePrive.setRecepteur(utilisateur2);
//        
//        messagepriveService.insert(messagePrive);
//        
//        utilisateur1.getMessagePrivesEmis().add(messagePrive);
//        utilisateur2.getMessagePrivesReçus().add(messagePrive);
//        
//        utilisateurService.update(utilisateur1);
//        utilisateurService.update(utilisateur2);
//        
//        Assert.assertEquals(1, utilisateurService.find(1L).getMessagePrivesEmis().size());
//        System.out.println("TAILLE : "+utilisateurService.find(1L).getMessagePrivesEmis().size());
//        
//        utilisateurService.delete(2L);
//        
//        try {
//            utilisateurService.login("Damien61", "azerty");
//        } catch (UtilisateurException ex) {
//            Logger.getLogger(ForumTest.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
    
}