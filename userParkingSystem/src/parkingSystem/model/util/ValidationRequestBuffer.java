import java.util.ArrayList;
import java.util.List;

public class ValidationRequestBuffer {

    private static ValidationRequestBuffer instance;
    private List<User> requests;

    private ValidationRequestBuffer() {
        this.requests = new ArrayList<>();
    }
    public static ValidationRequestBuffer getInstance() {
        if(instance == null) {
            instance = new ValidationRequestBuffer();
        }
        return instance;
    }

    public void addRequest(User user) {
        requests.add(user);
        //notify
        notifyManager(user);
    }
    public void removeRequest(User user) {
        requests.remove(user);
    }
    public List<User> getRequests() {
        return this.requests;
    }
    public void setRequests(List<User> requests) {
        this.requests = requests;
    }
    public void notifyManager(User user) {
        //Notify managers for the new user that needs validation
    }
}
