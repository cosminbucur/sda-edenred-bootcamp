package com.sda.hibernate.hibernate.listeners.history;

import static com.sda.hibernate.listeners.history.Action.*;

import java.time.LocalDateTime;

import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;

import com.sda.hibernate.listeners.customer.Customer;

public class CustomerHistoryListener {

	private CustomerHistoryRepository customerHistoryRepository;

	public CustomerHistoryListener() {
		this.customerHistoryRepository = new CustomerHistoryRepository();
	}

	@PostPersist
	public void postPersist(Customer customer) {
		perform(customer, INSERTED);
	}

	@PostUpdate
	public void postUpdate(Customer customer) {
		perform(customer, UPDATED);
	}

	@PostRemove
	public void postRemove(Customer customer) {
		perform(customer, DELETED);
	}

	public void perform(Customer customer, Action action) {
		CustomerHistory customerHistory = new CustomerHistory();
		customerHistory.setAction(action);
		customerHistory.setCreationDate(LocalDateTime.now());
		customerHistory.setCustomerId(customer.getId());
		customerHistory.setModifiedBy("current user");
		customerHistory.setAction(action);

		customerHistoryRepository.create(customerHistory);
	}
}
