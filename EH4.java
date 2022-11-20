import java.util.*;
class InvalidCountryException extends Exception
{
 public InvalidCountryException()
 {
  System.out.println("InvalidCountryException occured");
  System.out.println("User Outside India cannot be registered");
 }
}

class userRegistration
{
void registeruser(String name,String country)throws InvalidCountryException 
  {
 if(country.equals("India"))
     System.out.println("User registration done successfully");
 else
    throw new InvalidCountryException();
  }
}
class Main
{
	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String country=sc.nextLine();
		userRegistration registration = new userRegistration();
		try 
		{
		  registration.registeruser(name, country);
		} 
		catch(InvalidCountryException e) 
		{
		 System.out.println(e.getMessage());
		}
}
}
