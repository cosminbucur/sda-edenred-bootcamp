package com.sda.hibernate.hibernate.associations.one_to_one_join;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.sda.hibernate.config.HibernateUtil;

public class AccountDao {

	public void create(Account account) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			session.save(account);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public Account findById(Long id) {
		Account result = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			result = session.find(Account.class, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
