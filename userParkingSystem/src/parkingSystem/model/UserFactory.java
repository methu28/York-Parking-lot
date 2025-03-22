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
		
		AbstractUserFactory factory = getFactoryForRole(role);
        if (factory == null) {
            System.out.println("Invalid role. User creation failed.");
            return null;
        }

        AbstractUser user = factory.createUser(name, email, password);
		
		
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
	
	
	 private static AbstractUserFactory getFactoryForRole(String role) 
	 {
		 switch (role.toLowerCase()) 
		 {
		 	case "student":
		 		return new StudentUserFactory();
		 	case "faculty":
		 		return new FacultyUserFactory();
		 	case "non-faculty":
		 		return new NonFacultyUserFactory();
		 	case "visitor":
		 		return new VisitorUserFactory();
		 	default:
		 		return null;
	        }
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
