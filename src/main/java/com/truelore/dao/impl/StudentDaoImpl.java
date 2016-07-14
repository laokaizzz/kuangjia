package com.truelore.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.truelore.dao.StudentDao;
import com.truelore.entity.Student;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午2:43:10
 */
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
	
	@Override
	public Student load(Integer id) {
		return (Student) this.getCurrentSession().load(Student.class, id);
	}
	
	@Override
	public Student get(Integer id) {
		return (Student) this.getCurrentSession().get(Student.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAll() {
		List<Student> Students = this.getCurrentSession().createQuery("from Student").setCacheable(true).list();
		return Students;
	}

	@Override
	public void persist(Student entity) {
		this.getCurrentSession().persist(entity);

	}

	@Override
	public Integer save(Student entity) {
		return (Integer) this.getCurrentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(Student entity) {
		this.getCurrentSession().saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		Student entity = this.load(id);
		this.getCurrentSession().delete(entity);
	}

	@Override
	public void flush() {
		this.getCurrentSession().flush();

	}

}
