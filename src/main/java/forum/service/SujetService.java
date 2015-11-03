/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.SujetDAO;
import forum.entity.Sujet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */
@Service
public class SujetService {
     @Autowired
    private SujetDAO dao;
    
    @Transactional
    public void insert(Sujet sujet) {
        dao.save(sujet);
    }
    
    @Transactional
    public void delete(Long idSujet) {
        dao.delete(idSujet);
    }
    
    @Transactional
    public void deleteAll() {
        dao.deleteAll();
    }
    
    @Transactional
    public void modify(Sujet sujet) {
        dao.save(sujet);
    }
    
    public Sujet find(Long idSujet) {
        return dao.findOne(idSujet);
    }
    
    public Iterable<Sujet> findAll(){
        return dao.findAll();
    }
}
