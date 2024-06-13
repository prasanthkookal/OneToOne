package com.demo.relation.Util;

import com.demo.relation.DAO.TeamDAO;
import com.demo.relation.DTO.CaptainDTO;
import com.demo.relation.DTO.TeamDTO;

public class Tester {

	public static void main(String[] args) {
		TeamDTO tdto=new TeamDTO();
		tdto.setTeam_size(25);
		tdto.setTeam_logo("Elephant");
		tdto.setTeam_type("Football");
		
		CaptainDTO cdto=new CaptainDTO();
		cdto.setCaptain_name("sahal");
		cdto.setCaptain_age(24);
		cdto.setCaptain_place("Malappuram");
		
		tdto.setCaptdto(cdto);
		cdto.setTdto(tdto);
		
		new TeamDAO().save(tdto);
	}

}
