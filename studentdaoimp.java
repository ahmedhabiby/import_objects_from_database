package com.hibernate.jpa_curd.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hibernate.jpa_curd.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
public class studentdaoimp implements studentDAO {
   private EntityManager em1;

   //@autowired to perform constructor injection
   public studentdaoimp(EntityManager em2){
    em1=em2;
   }

    @Override
    @Transactional
    public void save(Student s1) {
       em1.persist(s1);
    }

   @Override
   public Student findById(Integer id) {
      return em1.find(Student.class, id);
   }

   @Override
   public List<Student> l1() {
      TypedQuery<Student> tq=em1.createQuery("from Student",Student.class);
      return tq.getResultList();
   }

}
