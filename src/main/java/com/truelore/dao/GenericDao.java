package com.truelore.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午2:41:07
 */
interface GenericDao<T, PK extends Serializable> {
	
	T load(PK id);
	
	T get(PK id);
	
	List<T> findAll();
	
	void persist(T entity);
	
	PK save(T entity);
	
	void saveOrUpdate(T entity);
	
	void delete(PK id);
	
	void flush();
}
