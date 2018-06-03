import java.util.ArrayList;

/**
 * Created by Harmandeep on 02-06-2018.
 */
public class Customer {

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name,double intialAmount) {
        this.name = name;
        transactions = new ArrayList<Double>();
        addTransaction(intialAmount);
    }

    public String getName() {
        return name;
    }

    public void addTransaction(double amount){
        transactions.add(amount);
    }
}
