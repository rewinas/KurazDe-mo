package com.kuraz.demo.KurazDe.mo.dao;

import com.kuraz.demo.KurazDe.mo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Type;
import java.util.List;

@Repository
public class StudentDAOImplementation implements StudentDAO{

    //define Entity Manager
    private EntityManager entityManager;

    //inject entity manager using constructor
    public StudentDAOImplementation(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public void save(Student theStudent){
entityManager.persist(theStudent );
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> findAll() {

        // create query
//        TypedQuery<Student> theQuery = entityManager.createQuery("From Student order by email desc",Student.class);
        TypedQuery<Student> theQuery = entityManager.createQuery("From Student",Student.class);
        //return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName){
        TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData",Student.class);
        theQuery.setParameter("theData",theLastName);
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        entityManager.merge(theStudent);

    }

    @Override
    @Transactional
    public void delete(Integer id) {
 Student theStudent = entityManager.find(Student.class,id);

 entityManager.remove(theStudent);
    }

    @Override
    @Transactional
    public int deleteAll() {

        int numRowsDeleted = entityManager.createQuery("DELETE FROM Student").executeUpdate();

        return numRowsDeleted;
    }
}
