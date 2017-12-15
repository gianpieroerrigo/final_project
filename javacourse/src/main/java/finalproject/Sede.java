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
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Set<Postazione> postazioni;
    private Set<Prodotto> prodotti;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@OneToMany(mappedBy = "Sede", cascade = CascadeType.ALL)
    public Set<Postazione> getPostazioni() {
        return postazioni;
    }
	
	@OneToMany(mappedBy = "Sede", cascade = CascadeType.ALL)
    public Set<Prodotto> getProdotti() {
        return prodotti;
    }

}