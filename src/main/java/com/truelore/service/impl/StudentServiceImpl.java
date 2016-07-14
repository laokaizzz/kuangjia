package com.truelore.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truelore.dao.StudentDao;
import com.truelore.entity.Student;
import com.truelore.service.StudentService;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午3:00:52
 */
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student load(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.load(id);
	}

	@Override
	public Student get(Integer id) {
		// TODO Auto-generated method stub
		return studentDao.get(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public void persist(Student entity) {
		// TODO Auto-generated method stub
		studentDao.persist(entity);
	}

	@Override
	public Integer save(Student entity) {
		// TODO Auto-generated method stub
		return studentDao.save(entity);
	}

	@Override
	public void saveOrUpdate(Student entity) {
		// TODO Auto-generated method stub
		studentDao.saveOrUpdate(entity);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		studentDao.delete(id);
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		studentDao.flush();
	}

}
