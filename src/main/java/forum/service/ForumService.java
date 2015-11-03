/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.ForumDAO;
import forum.entity.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ETY
 */

@Service
public class ForumService {
    
    @Autowired
    private ForumDAO dao;
    
    @Transactional
    public void insert(Forum forum) {
        dao.save(forum);
    }
    
    @Transactional
    public void delete(Long idForum) {
        dao.delete(idForum);
    }
    
    @Transactional
    public void deleteAll() {
        dao.deleteAll();
    }
    
    @Transactional
    public void modify(Forum forum) {
        dao.save(forum);
    }
    
    public Forum find(Long idForum) {
        return dao.findOne(idForum);
    }
    
    public Iterable<Forum> findAll(){
        return dao.findAll();
    }
}
