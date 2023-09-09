package com.kuraz.demo.KurazDe.mo;

import com.kuraz.demo.KurazDe.mo.dao.StudentDAO;
import com.kuraz.demo.KurazDe.mo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication

//		(
//				scanBasePackages = {
//						"com.kuraz.demo.KurazDe.mo",
//						"util"
//				}
//		)

public class KurazDeMoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KurazDeMoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{
//			createStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//		deleteAllStudents(studentDAO);
		};

	}


	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new Student");
		Student tempStudent = new Student("Biruk","Mamo","bkman@gmail.com");
		studentDAO.save(tempStudent);
		System.out.println("Saved Student generated id is: " + tempStudent.getId());
	}

	private void readStudent(StudentDAO studentDAO){
		System.out.println("Creating new Student Object");
		Student tempStudent = new Student("Zelalem","Hassan","zeelee@yahoo.com");
		studentDAO.save(tempStudent);

		int theId = tempStudent.getId();
		Student myStudent = studentDAO.findById(theId);
		System.out.println("The Student found is: " + myStudent);
	}
	private void queryForStudents(StudentDAO studentDAO){
		//get list of students
		List<Student> theStudents = studentDAO.findAll();
		//display list of students
		for (Student tempStudent: theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO){
		List<Student> theStudents = studentDAO.findByLastName("Mamo");
		for(Student tempStudent:theStudents){
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDAO){

		int studentId = 1;
//		find the student
		Student myStudent = studentDAO.findById(studentId);
//		change first name
		myStudent.setFirstName("Markus");
//		update student
		studentDAO.update(myStudent);
	System.out.println("Updated Student: " + myStudent);

	}

	private void deleteStudent(StudentDAO studentDAO){
		int studentId = 2;
		System.out.println(" Deleting the student with an ID of : " + studentId);
		studentDAO.delete(studentId);
	}
	private  void deleteAllStudents(StudentDAO studentDAO){
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count is:"+numRowsDeleted);
	}

}
