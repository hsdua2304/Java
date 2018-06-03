import java.util.ArrayList;

/**
 * Created by Harmandeep on 31-05-2018.
 */
public class MobilePhone {

    private String Number;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String number) {
        this.Number = number;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact Already Exist.");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println("Contact doesn't Exist");
            return false;
        }
        this.myContacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+", has been updated with " + newContact.getName());
        return true;
    }

    public String queryContact(Contact contact){
        if(findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println("Contact doesn't Exist");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " has been removed from the list.");
        return true;

    }

    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for(int i=0; i<myContacts.size(); i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    public void printContacts(){
        System.out.println("Contact List\n"+"-------------");
        for(int i=0; i<myContacts.size(); i++){
            System.out.println(myContacts.get(i).getName() + " : " + myContacts.get(i).getNumber());
        }
    }
}
