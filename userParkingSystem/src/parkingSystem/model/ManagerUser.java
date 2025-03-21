package parkingSystem.model;

public class ManagerUser extends AbstractUser {
	public ManagerUser(String name, String email, String password) {
		super(name, email, password, "Manager");
		this.isValid = true; 
		// TODO Auto-generated constructor stub
	}
}
