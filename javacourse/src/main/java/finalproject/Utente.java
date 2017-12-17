package finalproject;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Set<Sessione> sessioni;

    @Id
	public Integer getId() {
		return id;
	}

	@OneToMany(mappedBy = "utente", cascade = CascadeType.ALL)
    public Set<Sessione> getSessioni() {
        return sessioni;
    }
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setSessioni(Set<Sessione> sessioni) {
		this.sessioni = sessioni;
	}
	
	


}