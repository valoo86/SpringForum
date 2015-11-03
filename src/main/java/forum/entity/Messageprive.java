/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ETY
 */
@Entity
public class Messageprive implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String titre;
    
    private String sujet;
    
    @ManyToOne
    @JoinColumn(name = "emetteur_id")
    private Utilisateur emetteur;
    
    @ManyToOne
    @JoinColumn(name = "recepteur_id")
    private Utilisateur recepteur;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    public Messageprive(String titre, String sujet, Long id) {
        this.titre = titre;
        this.sujet = sujet;
        this.id = id;
    }
    
    public Messageprive() {
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public Utilisateur getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Utilisateur emetteur) {
        this.emetteur = emetteur;
    }

    public Utilisateur getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Utilisateur recepteur) {
        this.recepteur = recepteur;
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
        if (!(object instanceof Messageprive)) {
            return false;
        }
        Messageprive other = (Messageprive) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "forum.entity.Messageprive[ id=" + id + " ]";
    }
    
}
