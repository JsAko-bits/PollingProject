package classes;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table
@NamedQueries({
	@NamedQuery(name="Personne.findAll", query="SELECT u FROM Personne u order by u.nom"),
	@NamedQuery(name="Personne.findByAllergie", query="select u from Personne u join u.allergies as a where a.allergie = :allergieNom"),
	@NamedQuery(name="Personne.findByPreference", query="select u from Personne u join u.preferences as p where p.preference = :preferenceNom"),
	@NamedQuery(name="Personne.findCreatedSondageOnDate", query="select s from Personne u join u.sondages as s where u.email=:personneEmail"),
	@NamedQuery(name="Personne.findParticipationsOnDate", query="select p from Participation p where p.id =:userId"),
	@NamedQuery(name="Personne.findParticipations", query="select p from Participation p"),
})

public class Personne {

	private String email;
	
	private String nom;
	
	private String prenom;
	
	private Set<Sondage> sondages = new HashSet<Sondage>();
	
	private Set<Preference> preferences = new HashSet<Preference>();
	
	private Set<Allergie> allergies = new HashSet<Allergie>();
	
	private Set<Sondage> sondagesPart = new HashSet<Sondage>();
	
	public Personne() {
	}

	@Id
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@OneToMany(mappedBy="personne")
	public Set<Sondage> getSondages() {
		return sondages;
	}

	public void setSondages(Set<Sondage> sondages) {
		this.sondages = sondages;
	}

	@OneToMany(mappedBy="personne")
	public Set<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(Set<Preference> preferences) {
		this.preferences = preferences;
	}

	@OneToMany(mappedBy="personne")
	public Set<Allergie> getAllergies() {
		return allergies;
	}

	public void setAllergies(Set<Allergie> allergies) {
		this.allergies = allergies;
	}

	@OneToMany(mappedBy="personne")
	public Set<Sondage> getSondagesPart() {
		return sondagesPart;
	}

	public void setSondagesPart(Set<Sondage> sondagesPart) {
		this.sondagesPart = sondagesPart;
	}
	
	public void addAllergie(Allergie a) {
		allergies.add(a);
	}
	
	public void addSondage(Sondage s) {
		sondages.add(s);
	}
	
	public void addSondagePart(Sondage s) {
		sondagesPart.add(s);
	}
	
	public void addPreference(Preference p) {
		this.preferences.add(p);
	}
	
	
	public void removeAllergie(Allergie a) {
		allergies.remove(a);
	}
	
	public void removeSondage(Sondage s) {
		sondages.remove(s);
	}
	
	public void removeSondagePart(Sondage s) {
		sondagesPart.remove(s);
	}
	
	public void removePreference(Preference p) {
		this.preferences.remove(p);
	}
	
}
