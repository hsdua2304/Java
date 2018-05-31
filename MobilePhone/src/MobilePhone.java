import java.util.ArrayList;

/**
 * Created by Harmandeep on 31-05-2018.
 */
public class MobilePhone {

    private ArrayList<Contact> myContacts;

    public MobilePhone(ArrayList<Contact> myContacts) {
        this.myContacts = myContacts;
    }

    public boolean addNewNumber(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact Already exist");
            return false;
        }
        
    }

}
