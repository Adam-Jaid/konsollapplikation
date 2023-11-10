import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserList {
    private List<User> userList;
    private java.util.Comparator<ThreadLocal> Comparator;

    public UserList() {
        this.userList = new ArrayList<>();
    }

    //  Hämta användare
    public void addUser(User user) {
        userList.add(user);
    }

    // Ta bort användare
    public void removeUser(int userId) {
        userList.removeIf(user -> user.getId() == userId);
    }

    public User getUserById(int userId) {
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    // Sortera användarna
    public void sortUsersByName() {
        Collections.sort(userList, java.util.Comparator.comparing(User::getName));
    }

    public User[] userList() {
        return new User[0];
    }
}
