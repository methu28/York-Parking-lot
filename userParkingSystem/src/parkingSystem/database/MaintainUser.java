package parkingSystem.database;
import parkingSystem.model.AbstractUser;
import parkingSystem.model.StudentUser;
import parkingSystem.model.FacultyUser;
import parkingSystem.model.VisitorUser;
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.*;
import java.util.*;

public class MaintainUser 
{
	private static final String File_Path = "users.csv";
	public ArrayList<AbstractUser> users = new ArrayList<>();
	
	public void load() throws Exception
	{
		users.clear();
	    CsvReader reader = new CsvReader(File_Path);
	    reader.readHeaders();

	    while (reader.readRecord()) 
	    {
	    	String name = reader.get("name");
	        String email = reader.get("email");
	        String password = reader.get("password");
	        String role = reader.get("role");
            boolean isValidated = Boolean.parseBoolean(reader.get("validated"));


	        AbstractUser user;
	        switch (role.toLowerCase()) 
	        {
	        	case "student":
	        		user = new StudentUser(name, email, password);
	                    break;
	        	case "faculty":
	        		user = new FacultyUser(name, email, password);
	                    break;
	        	case "visitor":
	        		user = new VisitorUser(name, email, password);
	                    break;
	        	default:
	        		System.out.println("Invalid role: " + role);
	                   	continue;
	            }

	            users.add(user);
	        }
	        reader.close();
	}
	
	public void update() throws Exception 
	{
		 CsvWriter csvOutput = new CsvWriter(new FileWriter(File_Path, false), ',');

	     csvOutput.write("name");
	     csvOutput.write("email");
	     csvOutput.write("password");
	     csvOutput.write("role");
	     csvOutput.endRecord();
	     
	     for (AbstractUser u : users) 
	     {
	    	 csvOutput.write(u.getName());
	         csvOutput.write(u.getEmail());
	         csvOutput.write(u.getPassword());
	         csvOutput.write(u.getRole());
	         csvOutput.endRecord();
	     }
	     csvOutput.close();
	}
	
	public void updateUser(String email, String newName, String newEmail, String newPassword) throws Exception 
	{
		boolean userUpdate = false;
		for (AbstractUser user : users) 
		{
			if (user.getEmail().equals(email)) 
			{
	             user.setName(newName);
	             user.setEmail(newEmail);
	             user.setPassword(newPassword);
	             userUpdate = true;
	             break; 
	            
			}
		}
		
		if(userUpdate)
		{
			 update(); 
             System.out.println("User updated successfully!");
		}
		else
		{
	        System.out.println("User not found!");	  

		}
	}

	 public void addUser(AbstractUser user) throws Exception
	 {
		 for (AbstractUser existingUser : users)
		 {
			 if (existingUser.getEmail().equals(user.getEmail())) 
			 {
				 System.out.println("A user with this email already exists!");
		         return;  
		     }
		 }
	    users.add(user);
	    update();
	    System.out.println("User added successfully!");

	 }
	 
}
