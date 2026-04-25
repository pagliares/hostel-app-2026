package hostealapp.model;

public class GuestTest {

    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setName("Atticus");
        guest.setLastName("Finch");

        System.out.println(guest.getName() + " " + guest.getLastName());

        Guest guest2 = new Guest();
        guest2.setName("Fermina");
        guest2.setLastName("Daza");

        System.out.println(guest2.getName() + " " + guest2.getLastName());

    }
}
