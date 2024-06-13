package com.demo.relation.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.relation.DTO.TeamDTO;

public class TeamDAO 
{
	public void save(TeamDTO dto)
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(TeamDTO.class);
		SessionFactory fact=cfg.buildSessionFactory();
		Session session=fact.openSession();
		Transaction tx=session.beginTransaction();
		try
		{
		session.save(dto);
		tx.commit();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		finally
		{
			session.close();
		}
	}
}
