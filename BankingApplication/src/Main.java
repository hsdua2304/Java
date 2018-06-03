/**
 * Created by Harmandeep on 02-06-2018.
 */
public class Main {

    public static void main(String args[]){
        Bank bank = new Bank("Canara bank");

        bank.addBankBranch("Kingsway Camp");
        bank.addCustomer("Kingsway Camp","Harman",100.0);
        bank.addCustomer("Kingsway Camp","Harpreet",200.0);

        bank.addBankBranch("Tagore Park");
        bank.addCustomer("Tagore Park","Harman",200.0);

        bank.addTransaction("Tagore Park","Harman",234.50);
        bank.addTransaction("Kingsway Camp","Harpreet",123.23);


    }
}
