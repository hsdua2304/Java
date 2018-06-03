import java.util.Scanner;

/**
 * Created by Harmandeep on 01-06-2018.
 */
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("9700133332");

    public static void  main(String args[]){
        boolean quit=false;
        startPhone();
        printOptions();

        while(!quit){
            System.out.print("Enter your option : ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 0:
                    quit=true;
                    System.out.println("Shutting down...");
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    searchContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 6:
                    printOptions();
                    break;
            }
        }
    }

    public static void startPhone(){
        System.out.println("Switching on the mobile phone...");
    }

    public static void printOptions(){
        System.out.println("ACTION LIST");
        System.out.println("0. Shutdown\n"+
        "1. Print Contacts\n"+
        "2. Add New Contact\n"+
        "3. Update Contact\n"+
        "4. Search Contact\n"+
        "5. Remove Contact\n"+
        "6. Print Action List");
    }

    public static void addNewContact(){
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number : ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(name,number);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("New Contact has been added with " + name + " : " + number);
        }else{
            System.out.println("Contact already exist in the file");
        }
    }

    public static void updateContact(){
        System.out.print("Enter the name for old contact : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact doesn't exist");
            return;
        }

        System.out.print("Enter new name : ");
        String newName = scanner.nextLine();
        System.out.print("Enter new number");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newNumber);
        if(mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("New Contact has been updated");
        }else{
            System.out.println("Can't update the new contact");
        }
    }

    public static void removeContact(){
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact doesn't exist");
            return;
        }

        if(mobilePhone.removeContact(existingContact)){
            System.out.println("Contact Removed");
        }else{
            System.out.println("Contact can't be removed");
        }
    }

    public static void searchContact(){
        System.out.print("Enter the name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null){
            System.out.println("Contact doesn't exist");
            return;
        }

        System.out.println("Name : " + existingContact.getName()+"\nPhone Number : "+ existingContact.getNumber());

    }
}
