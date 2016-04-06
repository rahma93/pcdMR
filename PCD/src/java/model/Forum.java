package model;
// Generated 6 avr. 2016 16:53:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Forum generated by hbm2java
 */
public class Forum  implements java.io.Serializable {


     private Integer idforum;
     private String forumnom;
     private Set articles = new HashSet(0);
     private Set notes = new HashSet(0);

    public Forum() {
    }

    public Forum(String forumnom, Set articles, Set notes) {
       this.forumnom = forumnom;
       this.articles = articles;
       this.notes = notes;
    }
   
    public Integer getIdforum() {
        return this.idforum;
    }
    
    public void setIdforum(Integer idforum) {
        this.idforum = idforum;
    }
    public String getForumnom() {
        return this.forumnom;
    }
    
    public void setForumnom(String forumnom) {
        this.forumnom = forumnom;
    }
    public Set getArticles() {
        return this.articles;
    }
    
    public void setArticles(Set articles) {
        this.articles = articles;
    }
    public Set getNotes() {
        return this.notes;
    }
    
    public void setNotes(Set notes) {
        this.notes = notes;
    }




}


