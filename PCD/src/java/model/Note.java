package model;
// Generated 27 mars 2016 14:38:31 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Note generated by hbm2java
 */
public class Note  implements java.io.Serializable {


     private Integer idnote;
     private Forum forum;
     private Integer notevaleur;
     private Set<Commentaire> commentaires = new HashSet<Commentaire>(0);
     private Set<MembreDonnerNote> membreDonnerNotes = new HashSet<MembreDonnerNote>(0);

    public Note() {
    }

    public Note(Forum forum, Integer notevaleur, Set<Commentaire> commentaires, Set<MembreDonnerNote> membreDonnerNotes) {
       this.forum = forum;
       this.notevaleur = notevaleur;
       this.commentaires = commentaires;
       this.membreDonnerNotes = membreDonnerNotes;
    }
   
    public Integer getIdnote() {
        return this.idnote;
    }
    
    public void setIdnote(Integer idnote) {
        this.idnote = idnote;
    }
    public Forum getForum() {
        return this.forum;
    }
    
    public void setForum(Forum forum) {
        this.forum = forum;
    }
    public Integer getNotevaleur() {
        return this.notevaleur;
    }
    
    public void setNotevaleur(Integer notevaleur) {
        this.notevaleur = notevaleur;
    }
    public Set<Commentaire> getCommentaires() {
        return this.commentaires;
    }
    
    public void setCommentaires(Set<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }
    public Set<MembreDonnerNote> getMembreDonnerNotes() {
        return this.membreDonnerNotes;
    }
    
    public void setMembreDonnerNotes(Set<MembreDonnerNote> membreDonnerNotes) {
        this.membreDonnerNotes = membreDonnerNotes;
    }




}


