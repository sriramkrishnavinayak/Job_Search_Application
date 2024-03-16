package Com.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.hibernate.Session;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;

import Job_Search_DAO.*;
import Job_Search_Entity.*;
import Job_Search_Util.Job_Search_Util;
import jakarta.persistence.criteria.CriteriaQuery;

public class Student_Testing {
	
	StudentDao studentdao;
	
//	 @BeforeEach
//	    public void setUp() {
//	        // bookdao while inserting new book details
//		 studentdao = new StudentDao();
//	     
//	    }
//	 
	 @Test
	    public void testNewStudentInsert() 
	 {
		Student s = new Student();
		
		   
		    studentdao = new StudentDao();
		    
		    		    
		    s.setFirst_Name("Uday");
		    s.setLast_Name("Kumar");
		    s.setPhone_number("6309145229");
		    s.setEmail("uday@gmail.com");
		    s.setSkills(" Java,Python,MySQL,Hibernate");
		    s.setResume("Udayresume.pdf");
		    s.setEducation("B.Tech");
		    s.setExperience("Iyear");
			
			
	        // Perform login
	        //boolean result = bookdao.TestsaveBook(b);

	        // Assert that login is successful
	        assertTrue(studentdao.TestsaveStudent(s));
	    }	

}