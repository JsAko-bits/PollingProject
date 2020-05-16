package classes;

import javax.persistence.*;

@Entity
@Table
public class Preference {

	private int id;
	private String preference;
	private Personne personne; 

	public Preference() {
		
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getPreference() {
		return preference;
	}
	
	public void setPreference(String preference) {
		this.preference = preference;
	}
	
	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
}
