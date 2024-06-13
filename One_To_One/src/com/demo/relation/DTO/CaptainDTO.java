package com.demo.relation.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="capt_table")
public class CaptainDTO implements Serializable
{

	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
private int captain_id;
private String captain_name;
private int captain_age;
private String captain_place;


@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="team")
private TeamDTO tdto;

public TeamDTO getTdto() {
	return tdto;
}
public void setTdto(TeamDTO tdto) {
	this.tdto = tdto;
}
public int getCaptain_id() {
	return captain_id;
}
public void setCaptain_id(int captain_id) {
	this.captain_id = captain_id;
}
public String getCaptain_name() {
	return captain_name;
}
public void setCaptain_name(String captain_name) {
	this.captain_name = captain_name;
}
public int getCaptain_age() {
	return captain_age;
}
public void setCaptain_age(int captain_age) {
	this.captain_age = captain_age;
}
public String getCaptain_place() {
	return captain_place;
}
public void setCaptain_place(String captain_place) {
	this.captain_place = captain_place;
}
public CaptainDTO() {
	System.out.print(this.getClass().getSimpleName()+" created");
}
@Override
public String toString() {
	return "CaptainDTO [captain_id=" + captain_id + ", captain_name=" + captain_name + ", captain_age=" + captain_age
			+ ", captain_place=" + captain_place + "]";
}
}
