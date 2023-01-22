package DAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import VO.RegVO;


public class RegDAO 
{

	public void insert(RegVO vo)
		{
			try
				{
					SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
					
					Session session = sessionFactory.openSession();
					
					Transaction transaction=session.beginTransaction();
					
					session.save(vo);
					
					transaction.commit();
					
					session.close();
				}
			catch(Exception ex)
				{
					ex.printStackTrace();
				}
		}

	public List select(RegVO vo)
	{ List ls = new ArrayList();
		try
			{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				Query q=session.createQuery("from RegVO where id='"+vo.getId()+"'");
				ls=q.list();
				
				transaction.commit();
				
				session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
		return ls;
	}
	public void delete(RegVO vo)
	{
		try
			{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				session.delete(vo);
				
				transaction.commit();
				
				session.close();
			}
		
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
	public void update(RegVO vo)
	{
		try
			{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				session.update(vo);
				
				transaction.commit();
				
				session.close();
			}
		catch(Exception ex)
			{
				ex.printStackTrace();
			}
	}
	
}
