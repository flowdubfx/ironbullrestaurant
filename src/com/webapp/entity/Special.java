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
@NamedQueries({ @NamedQuery(name = "Special.findAll", query = "SELECT s FROM Special s") })
@XmlRootElement
public class Special implements Serializable {

	private static final long serialVersionUID = 6669241406654285089L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "time_event")
	private String timeEvent;
	@Column(name = "happy_hour")
	private boolean happyHour;

	public Special() {
	}

	public Special(int id, String name, String description, String timeEvent) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.timeEvent = timeEvent;
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

	public String getTimeEvent() {
		return timeEvent;
	}

	public void setTimeEvent(String timeEvent) {
		this.timeEvent = timeEvent;
	}

	public boolean isHappyHour() {
		return happyHour;
	}

	public void setHappyHour(boolean happyHour) {
		this.happyHour = happyHour;
	}

}
