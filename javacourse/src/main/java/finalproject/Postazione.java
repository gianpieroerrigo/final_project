package finalproject;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Postazione {
    
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Sede sede;
    private Set<Sessione> sessioni;
    
    @Id
	public Integer getId() {
		return id;
	}

		
	@ManyToOne
    @JoinColumn(name = "sede")
    public Sede getSede() {
        return sede;
	}
	
	@OneToMany(mappedBy = "postazione", cascade = CascadeType.ALL)
    public Set<Sessione> getSessioni() {
        return sessioni;
    }
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}

	
	public void setSessioni(Set<Sessione> sessioni) {
		this.sessioni = sessioni;
	}
	
	
}