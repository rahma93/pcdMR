/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.HashSet;
import java.util.Set;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

/**
 *
 * @author Youssef
 */
@ManagedBean(name = "ABean", eager = true)
@RequestScoped

public class AgentMedicalBean {
    
     private Integer idagent;
     private String passwordagent;
     private String nomagent;
     private String prenomagent;
     private String emailagent;
     private String nomvilleagent;
     private String nompadresseagent;
     private Integer codepostalagent;
     private Integer telagent;
     private Integer typeagent;
     private Integer lon;
     private Integer lat;
     
     private Set<Commentaire> commentaires = new HashSet<Commentaire>(0);
     private Set<Article> articles = new HashSet<Article>(0);
     private Set<Profil> profils = new HashSet<Profil>(0);
     
     private Set<Photo> photos = new HashSet<Photo>(0);
     private Set<Offre> offres = new HashSet<Offre>(0);
     
     private String phototitre;
     private String photochemin;
     
     private String offreAgent;
     
    public String saveagent(){
                Session session = HibernateUtil.getSessionFactory().openSession();
                session.beginTransaction();
		//AgentMedicalDAO userDao = new AgentMedicalDAO();
                
                Set<Commentaire> commentaires = new HashSet<Commentaire>(0);
                Set<Article> articles = new HashSet<Article>(0);
                Set<Profil> profils = new HashSet<Profil>(0);
                
                Set<Photo> photos = new HashSet<Photo>(0);
                Set<Offre> offres = new HashSet<Offre>(0);
                
		AgentMedical agent = new AgentMedical(passwordagent,nomagent,prenomagent,emailagent,nomvilleagent,nompadresseagent,codepostalagent,telagent,typeagent,lon,lat,commentaires,articles, profils);
		
                session.save(agent);
                
                Profil profil=new Profil(agent,nomagent,photos,offres);
		session.save(profil);
                
                Offre offre=new Offre(profil,offreAgent);
                session.save(offre);
                
                Photo photo=new Photo(profil,phototitre,photochemin);
                session.save(photo);
		//produitDao.save(produit);
                session.getTransaction().commit();
		session.close();
		//System.out.println("User successfully saved.");
		return "output";
                            }
    
    
    public String verifyUser(){
		AgentMedicalDAO agentDAO = new AgentMedicalDAO();
		AgentMedical agent = new AgentMedical(passwordagent,nomagent,prenomagent,emailagent,nomvilleagent,nompadresseagent,codepostalagent,telagent,typeagent,lon,lat,commentaires,articles, profils);
		Integer response = agentDAO.verify(emailagent,passwordagent);
		if (response==2) return "adminloggedin";
                        else if (response==1) return "userloggedin";
                else return "welcome";
                }
    
    
     public Integer getIdagent() {
        return idagent;
    }

    public void setIdagent(Integer idagent) {
        this.idagent = idagent;
    }

    

    public String getPasswordagent() {
        return passwordagent;
    }

    public void setPasswordagent(String passwordagent) {
        this.passwordagent = passwordagent;
    }

    public String getNomagent() {
        return nomagent;
    }

    public void setNomagent(String nomagent) {
        this.nomagent = nomagent;
    }

    public String getPrenomagent() {
        return prenomagent;
    }

    public void setPrenomagent(String prenomagent) {
        this.prenomagent = prenomagent;
    }

    public String getEmailagent() {
        return emailagent;
    }

    public void setEmailagent(String emailagent) {
        this.emailagent = emailagent;
    }

    public String getNomvilleagent() {
        return nomvilleagent;
    }

    public void setNomvilleagent(String nomvilleagent) {
        this.nomvilleagent = nomvilleagent;
    }

    public String getNompadresseagent() {
        return nompadresseagent;
    }

    public void setNompadresseagent(String nompadresseagent) {
        this.nompadresseagent = nompadresseagent;
    }

    public Integer getCodepostalagent() {
        return codepostalagent;
    }

    public void setCodepostalagent(Integer codepostalagent) {
        this.codepostalagent = codepostalagent;
    }

    public Integer getTelagent() {
        return telagent;
    }

    public void setTelagent(Integer telagent) {
        this.telagent = telagent;
    }

    public Integer getTypeagent() {
        return typeagent;
    }

    public void setTypeagent(Integer typeagent) {
        this.typeagent = typeagent;
    }

    public Integer getLon() {
        return lon;
    }

    public void setLon(Integer lon) {
        this.lon = lon;
    }

    public Integer getLat() {
        return lat;
    }

    public void setLat(Integer lat) {
        this.lat = lat;
    }

   

    public Set<Commentaire> getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }

    public Set<Profil> getProfils() {
        return profils;
    }

    public void setProfils(Set<Profil> profils) {
        this.profils = profils;
    }

    public Set<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(Set<Photo> photos) {
        this.photos = photos;
    }

    public String getPhototitre() {
        return phototitre;
    }

    public void setPhototitre(String phototitre) {
        this.phototitre = phototitre;
    }

    public String getPhotochemin() {
        return photochemin;
    }

    public String getOffreAgent() {
        return offreAgent;
    }

    public void setOffreAgent(String offreAgent) {
        this.offreAgent = offreAgent;
    }

    public void setPhotochemin(String photochemin) {
        this.photochemin = photochemin;
    }

    public Set<Offre> getOffres() {
        return offres;
    }

    public void setOffres(Set<Offre> offres) {
        this.offres = offres;
    }
     

    public AgentMedicalBean() {
    }
    
    
    
}