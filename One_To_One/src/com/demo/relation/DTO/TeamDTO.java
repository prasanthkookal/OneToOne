package com.demo.relation.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="team_table")

public class TeamDTO implements Serializable{
	
	
	@Id
	@GenericGenerator(name="ref",strategy="increment")
	@GeneratedValue(generator="ref")
	
	private int team_id;
	private int team_size;
	private String team_logo;
	private String team_type;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CaptainDTO captdto;
	
	
	public CaptainDTO getCaptdto() {
		return captdto;
	}
	public void setCaptdto(CaptainDTO captdto) {
		this.captdto = captdto;
	}
	public int getTeam_id() {
		return team_id;
	}
	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}
	public int getTeam_size() {
		return team_size;
	}
	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}
	public String getTeam_logo() {
		return team_logo;
	}
	public void setTeam_logo(String team_logo) {
		this.team_logo = team_logo;
	}
	public String getTeam_type() {
		return team_type;
	}
	public void setTeam_type(String team_type) {
		this.team_type = team_type;
	}
	public TeamDTO() {
		System.out.println(this.getClass().getSimpleName()+ " Created");
	}
	@Override
	public String toString() {
		return "TeamDTO [team_id=" + team_id + ", team_size=" + team_size + ", team_logo=" + team_logo + ", team_type="
				+ team_type + "]";
	}
	
}
