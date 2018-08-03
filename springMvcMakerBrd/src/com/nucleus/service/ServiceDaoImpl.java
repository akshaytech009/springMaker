package com.nucleus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nucleus.model.persistence.dao.CustomerDao;
import com.nucleus.model.persistence.entity.Customer;
@Service
public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	private CustomerDao customerDao;
	
	@Override
	@Transactional
	public Customer addcustomer(Customer customer) {
		
		customerDao.addCustomer(customer);
		return customer;
		
	}

	@Override
	@Transactional
	public void deleteCustomer(String customerCode) {
		System.out.println(" delete");
		
		customerDao.deleteCustomer(customerCode);
		
	}

	@Override
	@Transactional
	public Customer viewCustomer(String customerCode) {
		return customerDao.viewCustomer(customerCode);
	}

	@Override
	public void viewallCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public List<Customer> viewAll() {
		
		return customerDao.getAllCustomers();	
		
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
	}
	


}
