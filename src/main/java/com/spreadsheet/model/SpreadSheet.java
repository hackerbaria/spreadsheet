package com.spreadsheet.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name ="spreadsheet")
public class SpreadSheet implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSpreadSheet", unique = true, nullable = false)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
    @JoinColumn(name="idOwner")
	private User user;
	
	@OneToMany(mappedBy="spreadsheetData")
	private Set<Data> datas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public void User() {
		
	}

	public SpreadSheet(String name, User user) {
		super();
		this.name = name;
		this.user = user;
	}
	public SpreadSheet() {
		
	}
	
	

}
