package hostealapp.model;

public class GuestTest {

    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setName("Atticus");
        guest.setLastName("Finch");
        guest.setCity("Alfenas");
        guest.setState("MG");
        guest.setAddress("Rua Governador Pablo Neruda");
        guest.setZipCode("37500-000");
        guest.setEmail("finch@gmail.com");

        GuestTest x = new GuestTest();
        x.exibirDados(guest);

        guest = new Guest();
        guest.setName("Fermina");
        guest.setLastName("Daza");
        guest.setCity("Las Vegas");
        guest.setState("Nevada");
        guest.setAddress("Main Street");
        guest.setZipCode("5555-000-000");
        guest.setEmail("daza@gmail.com");

        System.out.println();
        x.exibirDados(guest);

    }

    public void exibirDados(Guest guest){
        System.out.println("---- Guest Information ----");
        System.out.println("Name...." + guest.getName());
        System.out.println("Lastname...." + guest.getLastName());
        System.out.println("Address...." + guest.getAddress());
        System.out.println("ZipCode...." + guest.getZipCode());
        System.out.println("City...." + guest.getCity());
        System.out.println("State...." + guest.getState());
        System.out.println("E-mail...." + guest.getEmail());
    }
}
