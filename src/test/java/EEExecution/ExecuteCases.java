package EEExecution;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseDriver;
import pagescreen.Loginpage;
@Listeners(Listen.TestNG_Listeners.class)
public class ExecuteCases  extends BaseDriver
   {
	Loginpage lpobj;  
	public ExecuteCases()
	{
		super();
		lpobj =  new Loginpage();  
		
	}
	@Test(priority = 0)
	public void ValidateLogin() throws InterruptedException
	{
		System.out.println(config.getProperty("username"));
		lpobj.EnterUsername(config.getProperty("username"));
		lpobj.EnterPassword(config.getProperty("password"));
		lpobj.clickloginbutton();
		Thread.sleep(3000);
		//lpobj.selectquuestion(2);
		Thread.sleep(1000);
		//lpobj.EnterAnswer("1");
	//	lpobj.clicksubmit();
	}
   }
