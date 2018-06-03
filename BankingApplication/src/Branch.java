import java.util.ArrayList;

/**
 * Created by Harmandeep on 02-06-2018.
 */
public class Branch {

    private String branchName;
    private ArrayList<Customer> customerList = new ArrayList<>();
    private Customer customer;

    public Branch(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchName() {
        return branchName;
    }

    public Branch createBankBranch(String branchName){
        return new Branch(branchName);
    }

    public boolean addCustomer(String customerName,double initialAmount){
        if(findCustomer(customer) >= 0){
            System.out.println("Customer already exist!!!");
            return false;
        }
        customerList.add(new Customer(customerName,initialAmount));
        System.out.println(customer.getName() + " is added as new customer.");
        return true;
    }

    private Customer findCustomer(String name){
        for(int i=0; i<customerList.size(); i++){
            Customer existingCustomer = customerList.get(i);
            if(existingCustomer.getName().equals(name)) {
                return existingCustomer;
            }
        }
        return null;
    }

    public boolean addTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    private int findCustomer(Customer customer){
        return this.customerList.indexOf(customer);
    }
}
