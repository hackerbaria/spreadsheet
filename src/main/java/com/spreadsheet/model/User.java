package com.spreadsheet.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser", unique = true, nullable = false)
	private int id;
	
	@Column(name = "name")
	private String name;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setName(String name) {
		this.name = name;
	}


	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@OneToMany(mappedBy="user")
	private Set<SpreadSheet> spreadSheets;

	
	public Set<SpreadSheet> getSpreadSheets() {
		return spreadSheets;
	}

	public void setSpreadSheets(Set<SpreadSheet> spreadSheets) {
		this.spreadSheets = spreadSheets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public User(String name, String username, String password, String email,
			Set<SpreadSheet> spreadSheets) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.spreadSheets = spreadSheets;
	}

	public User() {
	}
}
