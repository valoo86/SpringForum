/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author ETY
 */
@Entity
public class Forum implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String titre;
    
    @ManyToMany(mappedBy = "forumsAbonnes")
    private List<Utilisateur> utilisateurAbonne;
    
    @ManyToOne
    @JoinColumn(name = "createur_id")
    Utilisateur createur;
    
    @OneToMany(mappedBy = "forum")
    private List<Sujet> sujets;

    public Forum() {
    }
    
    public List<Utilisateur> getUtilisateurAbonne() {
        return utilisateurAbonne;
    }

    public void setUtilisateurAbonne(List<Utilisateur> utilisateurAbonne) {
        this.utilisateurAbonne = utilisateurAbonne;
    }

    public Utilisateur getCreateur() {
        return createur;
    }

    public void setCreateur(Utilisateur createur) {
        this.createur = createur;
    }

    public List<Sujet> getSujets() {
        return sujets;
    }

    public void setSujets(List<Sujet> sujets) {
        this.sujets = sujets;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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
        if (!(object instanceof Forum)) {
            return false;
        }
        Forum other = (Forum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Forum[ id=" + id + " ]";
    }
    
}
