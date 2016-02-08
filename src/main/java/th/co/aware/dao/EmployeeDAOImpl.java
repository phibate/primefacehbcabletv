package th.co.aware.dao;

import java.util.List;

//import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.aware.model.Employee;

@Component
public class EmployeeDAOImpl implements EmployeeDAO {
       
       @Autowired
       private SessionFactory sessionFactory;

       //@Override
       public void register(Employee emp) {
              // TODO Auto-generated method stub
              Session session = this.sessionFactory.openSession();
              Transaction tx = session.beginTransaction();
              session.persist(emp);
              tx.commit();
              session.close();
       }

       public List<Employee> findAll() {
              Session session = this.sessionFactory.openSession();
              List<Employee> employeeList = session.createCriteria(Employee.class).list();
              session.close();
              return employeeList;
              
       }

       public SessionFactory getSessionFactory() {
              return sessionFactory;
       }

       public void setSessionFactory(SessionFactory sessionFactory) {
              this.sessionFactory = sessionFactory;
       }

}

