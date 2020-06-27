package pagescreen;

import Base.BaseDriver;
import Base.Library;

public class Loginpage extends BaseDriver
{
	Library library;
       public Loginpage()
       {
    	   super();
    	   library = new Library();
    	   
       }
       
       public void EnterUsername(String username)
       {
    	   library.clearTextbox(object.getProperty("username_id"), "id");
    	   library.Entertext(object.getProperty("username_id"), "id", username);
    	   log.info("username Entered");
       }
       public void EnterPassword(String password)
       {
    	   library.clearTextbox(object.getProperty("password_id"), "id");
    	   library.Entertext(object.getProperty("password_id"), "id", password);
    	   log.info("password Entered");
       }
       
       public void clickloginbutton()
       {
    	   library.clickonwebelement(object.getProperty("loginbutton_id"), "id");
    	   log.info("login button clicked");
       }
}
