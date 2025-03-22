package parkingSystem.model;

public interface AbstractUserFactory 
{
    AbstractUser createUser(String name, String email, String password);

}

class StudentUserFactory implements AbstractUserFactory 
{
    @Override
    public AbstractUser createUser(String name, String email, String password) 
    {
        return new StudentUser(name, email, password);
    }
}

class FacultyUserFactory implements AbstractUserFactory 
{
    @Override
    public AbstractUser createUser(String name, String email, String password) 
    {
        return new FacultyUser(name, email, password);
    }
}

class NonFacultyUserFactory implements AbstractUserFactory 
{
    @Override
    public AbstractUser createUser(String name, String email, String password) 
    {
        return new NonFacultyUser(name, email, password);
    }
}

class ManagerUserFactory implements AbstractUserFactory 
{
    @Override
    public AbstractUser createUser(String name, String email, String password) 
    {
        AbstractUser user = new ManagerUser(name, email, password);
        return user;
    }
}

class VisitorUserFactory implements AbstractUserFactory 
{
    @Override
    public AbstractUser createUser(String name, String email, String password) 
    {
        AbstractUser user = new VisitorUser(name, email, password);
        user.isValid = true;
        return user;
    }
}
