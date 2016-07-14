package com.truelore;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.truelore.entity.Student;
import com.truelore.service.StudentService;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午3:29:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring.xml","file:src/main/webapp/WEB-INF/spring-hibernate.xml" })
public class TestStudentService {
	private static final Logger LOGGER = Logger
			.getLogger(TestStudentService.class);
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void save() {
		Student student = new Student();
		student.setDepartId(2);
		student.setRemark("hahaha");
		student.setSex(false);
		student.setStuName("新增的学生");
		Integer id = studentService.save(student);
		LOGGER.info(JSON.toJSONString(id));
	}

	
}
