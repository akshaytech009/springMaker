package com.nucleus.model.persistence.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


	@Entity
	@Table(name="Customer_1227")
	public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE) 
		private int customerId;
		@Column(nullable=false,unique=true)
		private String customerCode;
		private String customerName;
		private String customerAddress1;
		private String customerAddress2;
		private String customerPinCode;
		private String emailAddress;
		private String contactNumber;
		private String primaryContactPerson;
		private String recordStatus;
		private String Flag;
		@Temporal(TemporalType.DATE)
		private Date createDate;
		private String createdBy;
		private String modifiedDate;
		private String modifiedBy;
		
		public Customer(String customerCode,
				String customerName, String customerAddress1,
				String customerAddress2, String customerPinCode,
				String emailAddress, String contactNumber,
				String primaryContactPerson, String recordStatus,
				String createdBy,String flag) {
			super();
		//	this.customerId = customerId;
			this.customerCode = customerCode;
			this.customerName = customerName;
			this.customerAddress1 = customerAddress1;
			this.customerAddress2 = customerAddress2;
			this.customerPinCode = customerPinCode;
			this.emailAddress = emailAddress;
			this.contactNumber = contactNumber;
			this.primaryContactPerson = primaryContactPerson;
			this.recordStatus = recordStatus;
			this.Flag = flag;
			this.createDate = new Date();
			this.createdBy = createdBy;
			//this.modifiedDate = modifiedDate;
			//this.modifiedBy = modifiedBy;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getCustomerCode() {
			return customerCode;
		}
		public void setCustomerCode(String customerCode) {
			this.customerCode = customerCode;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCustomerAddress1() {
			return customerAddress1;
		}
		public void setCustomerAddress1(String customerAddress1) {
			this.customerAddress1 = customerAddress1;
		}
		public String getCustomerAddress2() {
			return customerAddress2;
		}
		public void setCustomerAddress2(String customerAddress2) {
			this.customerAddress2 = customerAddress2;
		}
		public String getCustomerPinCode() {
			return customerPinCode;
		}
		public void setCustomerPinCode(String customerPinCode) {
			this.customerPinCode = customerPinCode;
		}
		public String getEmailAddress() {
			return emailAddress;
		}
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getPrimaryContactPerson() {
			return primaryContactPerson;
		}
		public void setPrimaryContactPerson(String primaryContactPerson) {
			this.primaryContactPerson = primaryContactPerson;
		}
		public String getRecordStatus() {
			return recordStatus;
		}
		public void setRecordStatus(String recordStatus) {
			this.recordStatus = recordStatus;
		}
		public String getFlag() {
			return Flag;
		}
		public void setFlag(String Flag) {
			this.Flag = Flag;
		}
		public Date getCreateDate() {
			return createDate;
		}
		
		public String getCreatedBy() {
			return createdBy;
		}
		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}
		public String getModifiedDate() {
			return modifiedDate;
		}
		public void setModifiedDate(String modifiedDate) {
			this.modifiedDate = modifiedDate;
		}
		public String getModifiedBy() {
			return modifiedBy;
		}
		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
		public Customer() {
			super();
		}
		
}

