package model;
// Generated 27 mars 2016 14:38:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * CentreMedical generated by hbm2java
 */
public class CentreMedical  implements java.io.Serializable {


     private Integer idcentre;
     private AgentMedical agentMedical;
     private String nomcentre;
     private Set<Profil> profils = new HashSet<Profil>(0);
     private Set<AgentMedical> agentMedicals = new HashSet<AgentMedical>(0);

    public CentreMedical() {
    }

    public CentreMedical(AgentMedical agentMedical, String nomcentre, Set<Profil> profils, Set<AgentMedical> agentMedicals) {
       this.agentMedical = agentMedical;
       this.nomcentre = nomcentre;
       this.profils = profils;
       this.agentMedicals = agentMedicals;
    }
   
    public Integer getIdcentre() {
        return this.idcentre;
    }
    
    public void setIdcentre(Integer idcentre) {
        this.idcentre = idcentre;
    }
    public AgentMedical getAgentMedical() {
        return this.agentMedical;
    }
    
    public void setAgentMedical(AgentMedical agentMedical) {
        this.agentMedical = agentMedical;
    }
    public String getNomcentre() {
        return this.nomcentre;
    }
    
    public void setNomcentre(String nomcentre) {
        this.nomcentre = nomcentre;
    }
    public Set<Profil> getProfils() {
        return this.profils;
    }
    
    public void setProfils(Set<Profil> profils) {
        this.profils = profils;
    }
    public Set<AgentMedical> getAgentMedicals() {
        return this.agentMedicals;
    }
    
    public void setAgentMedicals(Set<AgentMedical> agentMedicals) {
        this.agentMedicals = agentMedicals;
    }




}


