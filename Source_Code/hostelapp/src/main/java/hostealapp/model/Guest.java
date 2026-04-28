package hostealapp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
public class Guest {
    private String name;
    private String lastName;
    private String address;
    private String zipCode;
    private String city;
    private String state;
    private String email;


    public Guest() {
        this(null);
    }

    public Guest(String name) {
        this(name, null);
    }

    public Guest(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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
