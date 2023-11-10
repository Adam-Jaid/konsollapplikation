# konsollapplikation
## User Management App

En enkel Java-konsollapplikation för hantering av användare.

### Bygga och köra

För att bygga och köra applikationen i en Linux-miljö, följ dessa steg:

#### Förutsättningar

- JDK (Java Development Kit) installerad på din dator. Du kan hämta den senaste versionen från [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) eller använda OpenJDK genom ditt pakethanteringsverktyg.

#### Steg 1: Kloning av repository

Öppna terminalen och klona detta Git-repository till din lokala maskin:

How add Git
git clone (https://github.com/din-anvandarnamn/user-management-app.git)

Öppna projektet i din Java IDE (t.ex. IntelliJ IDEA eller Eclipse).

Kompilera och kör `Main`-klassen.

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

<img src="" width= 300>
<img src="" width= 300>
<img src="" width= 300>
<img src="" width= 300>

