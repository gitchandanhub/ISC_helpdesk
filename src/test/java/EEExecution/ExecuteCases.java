package EEExecution;

import org.testng.annotations.Test;

import Base.BaseDriver;
import pagescreen.Loginpage;

public class ExecuteCases  extends BaseDriver
   {
	Loginpage lpobj;  
	public ExecuteCases()
	{
		super();
		lpobj =  new Loginpage();  
		
	}
	@Test(priority = 0)
	public void ValidateLogin()
	{
		System.out.println(config.getProperty("username"));
		lpobj.EnterUsername(config.getProperty("username"));
		lpobj.EnterPassword(config.getProperty("password"));
		lpobj.clickloginbutton();
	}
   }
