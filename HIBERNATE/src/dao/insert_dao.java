package dao;
import vo.insert_vo;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class insert_dao {

	public void insert(insert_vo vo)
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
	public List select(insert_vo vo)
	{ List ls = new ArrayList();
		try
			{
				SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
				
				Session session = sessionFactory.openSession();
				
				Transaction transaction=session.beginTransaction();
				
				Query q=session.createQuery("from insert_vo where id='"+vo.getId()+"'");
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
	public void delete(insert_vo vo)
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
}
