package classes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Paticipation.findAll", query="SELECT u FROM Participation u "),
	@NamedQuery(name="Participation.findByPersonne", query="select u from Participation u join u.personne as p where p.email = :email"),
	@NamedQuery(name="Participation.findBySondage", query="select u from Participation u join u.sondage as s where s.id = :sondageId"),
	@NamedQuery(name="Participation.findByDate", query="select u from Participation u "),
})

public class Participation {

	private int id;
	private Date dateParticipation;
	private Personne personne;
	private Sondage sondage;
	
	public Participation() {
		
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	public Date getDateParticpation() {
		return dateParticipation;
	}

	public void setDateParticpation(Date dateParticpation) {
		this.dateParticipation = dateParticpation;
	}

	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@ManyToOne
	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}	
	
}
