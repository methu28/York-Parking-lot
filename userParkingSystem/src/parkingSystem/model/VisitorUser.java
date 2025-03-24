package parkingSystem.model;

public class VisitorUser extends AbstractUser {
	public VisitorUser(String name, String email, String password) {
		super(name, email, password, "Visitor");
		this.isValid = true; 
		// TODO Auto-generated constructor stub
	}
	
}
