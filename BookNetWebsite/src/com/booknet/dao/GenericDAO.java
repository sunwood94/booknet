package com.booknet.dao;

import java.util.List;

public interface GenericDAO<T> {
	public T creare(T t);
	
	public T update(T t);
	
	public T get(Object id);
	
	public void delete(Object id);
	
	public List<T> listAll();
	
	public long count();
	
}
