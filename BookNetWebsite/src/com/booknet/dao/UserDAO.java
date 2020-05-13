package com.booknet.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.booknet.entity.Users;

public class UserDAO extends JpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
	}
	
	public Users create(Users user) {
		return super.create(user);
	}
	

	@Override
	public Users update(Users user) {
		return super.update(user);
	}

	@Override
	public Users get(Object userId) {
		return super.find(Users.class, userId);
	}

	public Users findByEmail(String email) {
		List<Users> listUsers = super.findWithNamedQuery("Users.findByEmail", "email", email);
	
		if (listUsers !=null && listUsers.size() > 0) {
			return listUsers.get(0);
		}
		return null;
	}
	
	@Override
	public void delete(Object userId) {
		super.delete(Users.class, userId);	
	}

	@Override
	public List<Users> listAll() {
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		return super.countWithNamedQuery("Users.countAll");
	}

	@Override
	public Users creare(Users t) {
		// TODO Auto-generated method stub
		return null;
	}


}
