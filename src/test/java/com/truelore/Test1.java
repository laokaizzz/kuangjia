package com.truelore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.truelore.service.StudentService;

/**
 * @author zhengkai
 *
 *  @date 2016年7月13日 下午4:45:22
 */
public class Test1 {

	public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring.xml");  
        
        StudentService cust = (StudentService)applicationContext.getBean("studentService");
        System.out.println(cust);
	}

}
