package classes;
import javax.persistence.*;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Allergie.findAll", query="SELECT u FROM Allergie u order by u.allergie"),
	@NamedQuery(name="Allergie.findByAllergie", query="select u from Personne u join u.allergies as a where a.allergie = :allergiNom"),
	@NamedQuery(name="Allergie.findByPreference", query="select u from Personne u join u.preferences as p where p.preference = :preferenceNom"),
	@NamedQuery(name="Allergie.findCreatedSondageOnDate", query="select s from Personne u join u.sondages as s where u.email=:personneEmail"),
	@NamedQuery(name="Allergie.findParticipationsOnDate", query="select p from Participation p where  p.id=:userId"),
	@NamedQuery(name="Allergie.findParticipations", query="select p from Participation p"),
})

public class Allergie {

	private int id;
	private String allergie;
	private Personne personne;
	
	public Allergie() {
		
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAllergie() {
		return allergie;
	}
	
	public void setAllergie(String allergie) {
		this.allergie = allergie;
	}

	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	
	
}
