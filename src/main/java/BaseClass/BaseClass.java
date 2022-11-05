package BaseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
   @BeforeSuite
   public void configureBS()
   {
	   System.out.println("connect with the database");
   }
   
   @BeforeTest
   public void configureBT()
   {
	   System.out.println("Execute the script in  the parallel mode");
   }
   @BeforeClass
   public void configureBC() {
	   System.out.println("launching  Browser");
   }
   @BeforeMethod
   public void configureBM() {
	   System.out.println("login to the appilication");
   }
   @AfterMethod
   public void configureAM()
   {
	   System.out.println("logout from the application");
   }
   @AfterClass
   public void configureAc() {
	   System.out.println("close the browser");
   }
   @AfterTest
   public void configureAT()
   {
	   System.out.println("close the parallel mode");
   }
   @AfterSuite
    public void configureAS() {
	   System.out.println("close the database connection");
   }
   
   
   
}
