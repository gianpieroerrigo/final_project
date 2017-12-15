package finalproject;

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
public class Ordine {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer prezzo;
    private Set<Prodotto> prodotti;
    private Set<Postazione> postazioni;
    private Sessione sessione;
	
    public Integer getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public Integer getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}
    
	@OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
    public Set<Prodotto> getProdotti() {
        return prodotti;
    }
	
	@OneToMany(mappedBy = "ordine", cascade = CascadeType.ALL)
    public Set<Postazione> getPostazioni() {
        return postazioni;
    }
    
	@ManyToOne
    @JoinColumn(name = "sessione")
    public Sessione getSessione() {
        return sessione;
	}

}
