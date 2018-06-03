/**
 * Created by Harmandeep on 31-05-2018.
 */
public class Contact {
    private String name;
    private String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }
}
