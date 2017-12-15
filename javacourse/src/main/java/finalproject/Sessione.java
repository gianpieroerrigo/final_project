package finalproject;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity 
public class Sessione {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Date inizio, fine;
    private Postazione postazione;
    private Utente utente;
    private Set<Ordine> ordini;
    
	public Integer getSessioneid() {
		return id;
	}
	public void setSessioneid(Integer sessioneid) {
		this.id = sessioneid;
	}
	public Date getInizio() {
		return inizio;
	}
	public void setInizio(Date inizio) {
		this.inizio = inizio;
	}
	public Date getFine() {
		return fine;
	}
	public void setFine(Date fine) {
		this.fine = fine;
	}
	
	@ManyToOne
    @JoinColumn(name = "postazione")
    public Postazione getPostazione() {
        return postazione;
	}
	
	@ManyToOne
    @JoinColumn(name = "utente")
    public Utente getUtente() {
        return utente;
	}
	
	@OneToMany(mappedBy = "sessione", cascade = CascadeType.ALL)
    public Set<Ordine> getOrdini() {
        return ordini;
    }

}
