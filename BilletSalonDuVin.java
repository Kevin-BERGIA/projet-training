// Salon du vin //
public class Main {
   
    // Déclaration des variables //
    public static void main(String[] args) {
        Event wineEvent = new Event ("Salon du vin", "Du 21 au 25 Février 2024", "Cournon d'Auvergne");
        UserManager userManager = new UserManager();
        EventManager eventManager = new EventManager();

        User user1 = new User("John Doe", "john@example.com");
        
        userManager.addUser(user1);

        eventManager.addEvent(wineEvent);


        // Méthode "For" pour avoir les "Return"  avec affichage voulu : réservation pour "nom - adresse mail"//
        System.out.println("Réservation pour " + wineEvent.getName() );
        for (User user : bookingManager.getBookings(wineEvent)) {
            System.out.println(user.getName() + " - " + user.getEmail());
        }
    }
}
// Définition de la classe + instruction "User" //
class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
// Définition de la classe + instruction "Event" //
class Event {
    private String name;

    public Event(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
// Définition de la classe + instruction "UserManager" //
class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }
}
// Conditions pour finaliser la réservation //
    public void bookTicket(User user, Event event) {
        if (!bookings.containsKey(event)) 
          
        bookings.get(event).add(user);
    }

    public List<User> getBookings(Event event) {
        return bookings.getOrDefault(event, Collections.emptyList());
    }
}