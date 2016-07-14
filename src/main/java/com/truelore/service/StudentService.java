package com.truelore.service;

import java.util.List;

import com.truelore.entity.Student;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午2:58:31
 */
public interface StudentService {
	Student load(Integer id);

	Student get(Integer id);

	List<Student> findAll();

	void persist(Student entity);

	Integer save(Student entity);

	void saveOrUpdate(Student entity);

	void delete(Integer id);

	void flush();
}
