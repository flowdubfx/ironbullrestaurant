package com.webapp.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({ @NamedQuery(name = "Career.findAll", query = "SELECT c FROM Career c"),
		@NamedQuery(name = "Career.findById", query = "SELECT c FROM Career c WHERE c.id =:id") })
@XmlRootElement
public class Career implements Serializable {

	private static final long serialVersionUID = -3618013843502093934L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "positions")
	private int positions;

	public Career() {
	}

	public Career(int id, String name, String description, int positions) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.positions = positions;
	}

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPositions() {
		return positions;
	}

	public void setPositions(int positions) {
		this.positions = positions;
	}

}
