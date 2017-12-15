package finalproject;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class Ordine {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer prezzo;
    private Prodotto prodotto;
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
    
    
	@ManyToOne
    @JoinColumn(name = "prodotto")
    public Prodotto getProdotto() {
        return prodotto;
	}
	
	@ManyToOne
    @JoinColumn(name = "sessione")
    public Sessione getSessione() {
        return sessione;
	}

}
