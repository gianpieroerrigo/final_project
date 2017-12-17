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
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String descrizione;
    private Integer prezzo;
    private Sede sede;
    private Set<Ordine> ordini;
    
    @Id
	public Integer getId() {
		return id;
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
	
	public void setId(Integer id) {
		this.id = id;
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

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	public void setOrdini(Set<Ordine> ordini) {
		this.ordini = ordini;
	}
	
	
	
}
