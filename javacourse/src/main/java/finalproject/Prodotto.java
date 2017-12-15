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
public class Prodotto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String descrizione;
    private Integer prezzo;
    private Sede sede;
    private Set<Ordine> ordini;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String desc) {
		descrizione = desc;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	
	@ManyToOne
    @JoinColumn(name = "sede")
    public Sede getSede() {
        return sede;
	}
	
	@OneToMany(mappedBy = "prodotto", cascade = CascadeType.ALL)
    public Set<Ordine> getOrdini() {
        return ordini;
    }
	
}
