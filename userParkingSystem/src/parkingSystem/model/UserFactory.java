package parkingSystem.model;
import java.util.*;

import parkingSystem.database.MaintainUser;

public class UserFactory {
	
	public static AbstractUser createUser(String name, String email, String password, String role)
	{
		if(!validPassword(password))
		{
			System.out.println("Error: Must contain atleast one uppercase, lowercase, number, and symbol character");
			return null;
		}
		
		AbstractUser user;
		
		switch(role.toLowerCase())
		{
			case "student":
				user = new StudentUser(name,email,password);
				break;
				
			case "faculty":
				user = new FacultyUser(name,email,password);
				break;
				
			case "non-faculty":
				user = new NonFacultyUser(name,email,password);
				break;
				
			case "manager":
				user = new ManagerUser(name,email,password);
				break;
				
			case "visitor":
				user = new VisitorUser(name,email,password);
				break;
				
			default:
				 System.out.println("Invalid role. User creation failed.");
	             return null;
		}
		
		 MaintainUser maintainUser = new MaintainUser();
		 try {
		        maintainUser.load();  
		        if (userExists(email, maintainUser)) 
		        {
	                System.out.println("Error: A user with this email already exists.");
	                return null;
	            }
		        maintainUser.addUser(user);
		    } catch (Exception e) {
		        e.printStackTrace();
		        return null;
		    }

		
		return user; 
		
	}

	private static boolean validPassword(String password) 
	{
		// TODO Auto-generated method stub
		
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$");
	}
	
	
	 private static boolean userExists(String email, MaintainUser maintainUser)
	 {
		 for (AbstractUser existingUser : maintainUser.users) 
		 {
			 if (existingUser.getEmail().equals(email)) 
			 {
	                return true;
			 }
		 }
	        return false;
	 }
	 
	 
	 public static boolean validateLogin(String email, String password) throws Exception 
	 {
		 MaintainUser maintainUser = new MaintainUser();
	     maintainUser.load(); 
	        
	     for (AbstractUser user : maintainUser.users) 
	     {
	           if (user.getEmail().equals(email)) 
	           {
	        	   if (user.getPassword().equals(password)) 
	                {
	                    return true;  
	                } 
	                else 
	                {
	                    System.out.println("Invalid password.");
	                    return false;  
	                }
	           }
	     }
	        
	        System.out.println("User not found.");
	        return false;  
	 }
	 

}
