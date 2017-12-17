package finalproject;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity 
public class Sede {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Set<Postazione> postazioni;
    private Set<Prodotto> prodotti;

	@Id
    public Integer getId() {
		return id;
	}

	
	@OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    public Set<Postazione> getPostazioni() {
        return postazioni;
    }
	
	
	@OneToMany(mappedBy = "sede", cascade = CascadeType.ALL)
    public Set<Prodotto> getProdotti() {
        return prodotti;
    }
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setPostazioni(Set<Postazione> postazioni) {
		this.postazioni = postazioni;
	}
	
	public void setProdotti(Set<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

}