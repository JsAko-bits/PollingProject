package classes;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table
public class Reunion {

	public enum etats {
		Sondage,
		Active,
		Passée
	}
	private int id;
	private String theme;
	private String resume;
	private etats etat;
	private Date date;
	private Sondage sondage;
	
	public Reunion() {
		
	}

	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTheme() {
		return theme;
	}
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getResume() {
		return resume;
	}
	
	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public etats getEtat() {
		return etat;
	}
	
	public void setEtat(etats etat) {
		this.etat = etat;
	}
	
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	@ManyToOne
	public Sondage getSondage() {
		return sondage;
	}

	public void setSondage(Sondage sondage) {
		this.sondage = sondage;
	}
}
