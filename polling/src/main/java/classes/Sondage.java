package classes;

import java.net.URI;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
public class Sondage {

	private int id;
	private URI url;
	private Date dateSondage;
	private Reunion reunion;
	private Personne personne;
	private Set<Participation> participants = new HashSet<Participation>();

	@Id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public URI getUrl() {
		return url;
	}
	
	public void setUrl(URI url) {
		this.url = url;
	}
	
	@ManyToOne
	public Reunion getReunion() {
		return reunion;
	}

	public void setReunion(Reunion reunion) {
		this.reunion = reunion;
	}

	public Date getDateDondage() {
		return dateSondage;
	}
	public void setDateDondage(Date dateDondage) {
		this.dateSondage = dateDondage;
	}
	
	@ManyToOne
	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@OneToMany(mappedBy="sondage")
	public Set<Participation> getParticipants() {
		return participants;
	}

	public void setParticipants(Set<Participation> participants) {
		this.participants = participants;
	}
	
	public void addParticipation(Participation p) {
		participants.add(p);
	}
	
	
}
