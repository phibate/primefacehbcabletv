package th.co.aware.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.model.PackageCTV;

@Component
public class PackageDAOImpl implements PackageDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	public void addPackage(PackageCTV packageCTV) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(packageCTV);
		tx.commit();
		session.close();

	}

	public void deletePackage(PackageCTV packageCTV) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(packageCTV);
		tx.commit();
		session.close();

	}

	public List<PackageCTV> findAll() {
		Session session = this.sessionFactory.openSession();
		List<PackageCTV> packageList = session.createCriteria(PackageCTV.class).list();
		session.close();
		return packageList;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}
