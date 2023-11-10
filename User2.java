public class User2 {
    public User searchUserById(int userId) {
        User[] userList = new User[0];
        for (User user : userList) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }
}