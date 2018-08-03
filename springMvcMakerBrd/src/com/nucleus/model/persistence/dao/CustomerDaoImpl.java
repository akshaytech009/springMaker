package com.nucleus.model.persistence.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nucleus.model.persistence.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private SessionFactory sessionFactory;
	protected Session getSession()
	{
		return sessionFactory.getCurrentSession();
	}

	  @SuppressWarnings("unchecked")
	@Override 
	  public List<Customer> getAllCustomers() {
		  return  (List<Customer>)getSession().createCriteria(Customer.class).list();
	 	  }
	 
	@Override

	public Customer addCustomer(Customer customer) {
		/*Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.getTransaction();*/
		getSession().save(customer);

		return customer;

	}

	

	

	

	@Override
	public boolean isValidCode(String customerCode) {
		// TODO Auto-generated method stub
		return false;
	}

	
	 @Override
	 public Customer updateCustomer(Customer customer ) {
		 Customer customer2=viewCustomer(customer.getCustomerCode());
		 customer2.setContactNumber(customer.getContactNumber());
			customer2.setCustomerAddress1(customer.getCustomerAddress1());
			customer2.setCustomerAddress2(customer.getCustomerAddress2());
			customer2.setCustomerName(customer.getCustomerName());
			customer2.setCustomerPinCode(customer.getCustomerPinCode());
			customer2.setEmailAddress(customer.getEmailAddress());
			customer2.setPrimaryContactPerson(customer.getPrimaryContactPerson());
	  getSession().merge(customer2); 
	  return customer;
	 }
	 
	@Override
	public Customer deleteCustomer(String customerCode) {
		
		System.out.println(" customer ");
		
		Customer customer = new Customer();
		System.out.println(" customer 11111111111111111111111111");
		Query q = getSession().createQuery("select c from Customer c  where c.customerCode=:customercode");
		q.setString("customercode", customerCode);
		System.out.println(" c*********************");
		@SuppressWarnings("unchecked")
		List<Customer> cust = q.list();
		if (cust.size() > 0) {
			customer = cust.get(0);
			getSession().delete(customer);

		}

		return customer;

	}

	
	  @Override public Customer viewCustomer(String customerCode) {
	 Customer cust =null;
		  Query query = getSession()
					.createQuery("select u from Customer u where u.customerCode=:customerCode");
			query.setParameter("customerCode", customerCode);
		
			List<Customer> customer = query.list();
			if (!customer.isEmpty()) {
				cust = customer.get(0);
			}
	  
	  return cust;
	  }
	 
	
	 /* 
	 * @Override public boolean isValidCode(String customerCode) { Session
	 * session = factory.openSession(); session.getTransaction().begin(); Query
	 * q = session
	 * .createQuery("select u from Customer u where u.customerCode=:customerCode "
	 * ); q.setString("customerCode", customerCode);
	 * 
	 * @SuppressWarnings("unchecked") List<Customer> list = q.list();
	 * session.getTransaction().commit();
	 * 
	 * if (list.isEmpty()) { System.out.println("something is found!");
	 * 
	 * Customer customer = list.get(0); System.out.println(customer);
	 * 
	 * return true;
	 * 
	 * } else { System.out.println("user not found"); return false; }
	 * 
	 * 
	 * }
	 */
}
