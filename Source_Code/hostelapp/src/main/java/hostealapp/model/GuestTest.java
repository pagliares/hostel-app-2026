package hostealapp.model;

public class GuestTest {

    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.setName("Atticus");
        guest.setLastName("Finch");
        guest.setEmail("finch@gmail.com");

        Address address = new Address();
        address.setCity("Alfenas");
        address.setState("MG");
        address.setAddress("Rua Governador Pablo Neruda");
        address.setZipCode("37500-000");

        guest.setAddress(address);

        GuestTest x = new GuestTest();
        x.exibirDados(guest);

        guest = new Guest();
        guest.setName("Fermina");
        guest.setLastName("Daza");
        guest.setEmail("daza@gmail.com");

        address = new Address();
        address.setCity("Las Vegas");
        address.setState("Nevada");
        address.setAddress("Main Street");
        address.setZipCode("5555-000-000");

        guest.setAddress(address);

        System.out.println();
        x.exibirDados(guest);

    }

    public void exibirDados(Guest guest){
        System.out.println("---- Guest Information ----");
        System.out.println("Name...." + guest.getName());
        System.out.println("Lastname...." + guest.getLastName());
        System.out.println("E-mail...." + guest.getEmail());

        System.out.println("---- Address Information ----");

        System.out.println("Address...." + guest.getAddress().getAddress());

        String zipCode = guest.getAddress().getZipCode();

        System.out.println("ZipCode...." + zipCode);
        System.out.println("City...." + guest.getAddress().getCity());
        System.out.println("State...." + guest.getAddress().getState());
    }


}
