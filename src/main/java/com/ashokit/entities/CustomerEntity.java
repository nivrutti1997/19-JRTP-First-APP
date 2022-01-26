package com.ashokit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERENTITIES")
public class CustomerEntity {
	@Id
	@Column(name="CUSTID")
	private Integer customerId;
	@Column(name="CUSTNAME")
	private String customerName;
	private String email;
	private Long contact;

	public CustomerEntity() {

	}

	public CustomerEntity(Integer customerId, String customerName, String email, Long contact) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.email = email;
		this.contact = contact;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "CustomerEntity [customerId=" + customerId + ", customerName=" + customerName + ", email=" + email
				+ ", contact=" + contact + "]";
	}

}
