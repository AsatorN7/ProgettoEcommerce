package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="account")
public class Account implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = -2966574268362210835L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="username", unique=true)
	private String username;
	@Column(name="password")
	private String password;
	@Column(name="id_ruolo")
	private int id_ruolo;
	@Column(name="portafoglio")
	private double portafoglio;
	@OneToOne
	@MapsId
	private Utente utente;
    //////////////////////
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId_ruolo() {
		return id_ruolo;
	}
	public void setId_ruolo(int id_ruolo) {
		this.id_ruolo = id_ruolo;
	}
	public double getPortafoglio() {
		return portafoglio;
	}
	public void setPortafoglio(double portafoglio) {
		this.portafoglio = portafoglio;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
}
