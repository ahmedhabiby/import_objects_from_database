package com.hibernate.jpa_curd;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.hibernate.jpa_curd.DAO.studentDAO;
import com.hibernate.jpa_curd.entity.Student;

@SpringBootApplication
public class JpaCurdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCurdApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(studentDAO sdao){
		return runner -> {
           //createMultistudent(sdao);
		   displayAllStudents(sdao);
		};
	}
		


private void displayAllStudents(studentDAO sdao) {
	List<Student> l1=sdao.l1();
	for(Student s1:l1)
	System.out.println(s1);
	}
/* 
private void createMultistudent(studentDAO sdao){
	System.out.println("create the objects...");
	Student s1 =new Student("hazem","mohamed","ahmednsra329@gmail.com");
	Student s2 =new Student("mazen","ahmed","ahmednsra329@gmail.com");
	Student s3 =new Student("hosam","zein","ahmednsra329@gmail.com");
	System.out.println("saving objects...");
	sdao.save(s1);
	sdao.save(s2);
	sdao.save(s3);
	
}*/


}
