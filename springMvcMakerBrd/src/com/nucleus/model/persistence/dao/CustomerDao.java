package com.nucleus.model.persistence.dao;

import java.util.List;

import com.nucleus.model.persistence.entity.Customer;



public interface CustomerDao {
	public List<Customer> getAllCustomers();
	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomer(String customerCode);
	public Customer viewCustomer(String customerCode);
	public boolean isValidCode(String customerCode);
}
