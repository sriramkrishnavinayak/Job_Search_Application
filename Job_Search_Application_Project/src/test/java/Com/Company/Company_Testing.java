package Com.Company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Job_Search_DAO.*;
import Job_Search_Entity.*;
public class Company_Testing {
	
	CompanyDao companydao;

//	 
	 @Test
 public void testNewCompanyInsert() 
	 {

		Companies c = new Companies();
		   
		companydao = new CompanyDao();
		    
		    		    
		    c.setCompany_Name("Capgemini");
		    c.setCompany_Email("capgemini@gmail.com");
		    c.setCompany_Address("Gachibowli");
			
	        // Perform login
	        //boolean result = bookdao.TestsaveBook(b);

	        // Assert that login is successful
	        assertTrue(companydao.TestsaveCompany(c));
	    }	

}