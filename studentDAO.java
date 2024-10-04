package com.hibernate.jpa_curd.DAO;

import java.util.List;

import com.hibernate.jpa_curd.entity.Student;

public interface studentDAO {
   void save(Student s1);
   Student findById(Integer id);
   List<Student> l1();
}
