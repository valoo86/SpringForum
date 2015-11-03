/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.MessagepriveDAO;
import forum.entity.Messageprive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */
@Service
public class MessagepriveService {
    @Autowired
    MessagepriveDAO dao;
    
    @Transactional
    public void insert(Messageprive messageprive) {
        dao.save(messageprive);
    }
    
    @Transactional
    public void delete(Long idMessageprive) {
        dao.delete(idMessageprive);
    }
    
    @Transactional
    public void deleteAll() {
        dao.deleteAll();
    }
    
    @Transactional
    public void modify(Messageprive messageprive) {
        dao.save(messageprive);
    }
    
    public Messageprive find(Long idMessageprive) {
        return dao.findOne(idMessageprive);
    }
    
    public Iterable<Messageprive> findAll(){
        return dao.findAll();
    }
}
