package com.nucleus.service;

import java.util.List;

import com.nucleus.model.persistence.entity.Customer;

public interface ServiceDao {

	public Customer addcustomer(Customer customer);
	public void deleteCustomer(String customerCode );
	public Customer viewCustomer(String customerCode );
	public void viewallCustomer();
	public List<Customer> viewAll();
	public void updateCustomer(Customer customer);
}
