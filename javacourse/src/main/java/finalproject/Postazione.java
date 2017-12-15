package finalproject;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Postazione {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private Sede sede;
    private Set<Sessione> sessioni;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@ManyToOne
    @JoinColumn(name = "sede")
    public Sede getSede() {
        return sede;
	}
	
	@OneToMany(mappedBy = "postazione", cascade = CascadeType.ALL)
    public Set<Sessione> getSessione() {
        return sessioni;
    }
	

}