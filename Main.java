public class Main {
    public static void main(String[] args) {
        // Skapa en användarlista
        UserList userList = new UserList();

        // Skapa några användare
        User user1 = new User(1, "Adam jaidoury", "Adam.jaidoury@gmail.com");
        User user2 = new User(2, "Adam jaidoury2", "Adam.jaidoury2@gmail.com");

        // Lägg till användare i listan
        userList.addUser(user1);
        userList.addUser(user2);

        // Sök efter användare baserat på id
        User foundUser;
        foundUser = userList.getUserById(1);
        System.out.println("Found User: " + foundUser.getName());

        // Sortera användarna baserat på namn
        userList.sortUsersByName();

        // Skriv ut alla användare efter sortering
        for (User user : userList.userList()) {
            System.out.println(user.getName());
        }
    }
}
