package finalproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity 
public class Ordine {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Integer prezzo;
    private Prodotto prodotto;
    private Sessione sessione;
	
    @Id
    public Integer getId() {
		return id;
	}
	
	public Integer getPrezzo() {
		return prezzo;
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
	
	public void setid(Integer id) {
		this.id = id;
	}
	
	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public void setSessione(Sessione sessione) {
		this.sessione = sessione;
	}
    
	

}
