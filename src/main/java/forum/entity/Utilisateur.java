/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public enum Type {
        ADMIN, MOD, UTIL;
    }
    
    public enum Etat {
        ACTIF, INACTIF;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String login;
    
    private String mdp;
    
    @Enumerated(EnumType.STRING)
    private Type type;
    
    @Enumerated(EnumType.STRING)
    private Etat etat;
    
    @JoinTable(name = "util_forums_abonnes",
               joinColumns = {@JoinColumn(name="util_id")},
               inverseJoinColumns = {@JoinColumn(name="forum_abonne_id")})
    @ManyToMany
    private List<Forum> forumsAbonnes;
    
    @OneToMany(mappedBy = "createur")
    private List<Forum> forumsCrees;
    
    @OneToMany(mappedBy = "createur")
    private List<Sujet> sujetsPostes;
    
    @OneToMany(mappedBy = "createur")
    private List<Message> messagesPostes;

    @OneToMany(mappedBy = "emetteur")
    private List<Messageprive> messagePrivesEmis;
    
    @OneToMany(mappedBy = "recepteur")
    private List<Messageprive> messagePrivesReçus;
    
    public Utilisateur(String login, String mdp, Type type, Long id) {
        this.login = login;
        this.mdp = mdp;
        this.type = type;
        this.id = id;
        this.etat = Etat.INACTIF;
    }

    public Utilisateur() {
        this.etat = Etat.INACTIF;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    
    public List<Messageprive> getMessagePrivesEmis() {
        return messagePrivesEmis;
    }

    public void setMessagePrivesEmis(List<Messageprive> messagePrivesEmis) {
        this.messagePrivesEmis = messagePrivesEmis;
    }

    public List<Messageprive> getMessagePrivesReçus() {
        return messagePrivesReçus;
    }

    public void setMessagePrivesReçus(List<Messageprive> messagePrivesReçus) {
        this.messagePrivesReçus = messagePrivesReçus;
    }
    
    public List<Forum> getForumsCrees() {
        return forumsCrees;
    }

    public void setForumsCrees(List<Forum> forumsCrees) {
        this.forumsCrees = forumsCrees;
    }
    
    public List<Forum> getForumsAbonnes() {
        return forumsAbonnes;
    }

    public void setForumsAbonnes(List<Forum> forumsAbonnes) {
        this.forumsAbonnes = forumsAbonnes;
    }

    public List<Sujet> getSujetsPostes() {
        return sujetsPostes;
    }

    public void setSujetsPostes(List<Sujet> sujetsPostes) {
        this.sujetsPostes = sujetsPostes;
    }

    public List<Message> getMessagesPostes() {
        return messagesPostes;
    }

    public void setMessagesPostes(List<Message> messagesPostes) {
        this.messagesPostes = messagesPostes;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Utilisateur[ id=" + id + " ]";
    }
    
}
