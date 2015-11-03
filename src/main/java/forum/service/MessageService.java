/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.MessageDAO;
import forum.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */
@Service
public class MessageService {
    @Autowired
    private MessageDAO dao;
    
    @Transactional
    public void insert(Message message) {
        dao.save(message);
    }
    
    @Transactional
    public void delete(Long idMessage) {
        dao.delete(idMessage);
    }
    
    @Transactional
    public void deleteAll() {
        dao.deleteAll();
    }
    
    @Transactional
    public void modify(Message message) {
        dao.save(message);
    }
    
    public Message find(Long idMessage) {
        return dao.findOne(idMessage);
    }
    
    public Iterable<Message> findAll(){
        return dao.findAll();
    }
}
