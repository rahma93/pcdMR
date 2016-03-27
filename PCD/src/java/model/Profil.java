package model;
// Generated 27 mars 2016 14:38:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profil generated by hbm2java
 */
public class Profil  implements java.io.Serializable {


     private Integer idprofil;
     private AgentMedical agentMedical;
     private CentreMedical centreMedical;
     private String profilnom;
     private Set<Photo> photos = new HashSet<Photo>(0);
     private Set<Offre> offres = new HashSet<Offre>(0);

    public Profil() {
    }

    public Profil(AgentMedical agentMedical, CentreMedical centreMedical, String profilnom, Set<Photo> photos, Set<Offre> offres) {
       this.agentMedical = agentMedical;
       this.centreMedical = centreMedical;
       this.profilnom = profilnom;
       this.photos = photos;
       this.offres = offres;
    }
   
    public Integer getIdprofil() {
        return this.idprofil;
    }
    
    public void setIdprofil(Integer idprofil) {
        this.idprofil = idprofil;
    }
    public AgentMedical getAgentMedical() {
        return this.agentMedical;
    }
    
    public void setAgentMedical(AgentMedical agentMedical) {
        this.agentMedical = agentMedical;
    }
    public CentreMedical getCentreMedical() {
        return this.centreMedical;
    }
    
    public void setCentreMedical(CentreMedical centreMedical) {
        this.centreMedical = centreMedical;
    }
    public String getProfilnom() {
        return this.profilnom;
    }
    
    public void setProfilnom(String profilnom) {
        this.profilnom = profilnom;
    }
    public Set<Photo> getPhotos() {
        return this.photos;
    }
    
    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }
    public Set<Offre> getOffres() {
        return this.offres;
    }
    
    public void setOffres(Set<Offre> offres) {
        this.offres = offres;
    }




}


