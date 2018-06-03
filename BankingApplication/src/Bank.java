import java.util.ArrayList;

/**
 * Created by Harmandeep on 02-06-2018.
 */
public class Bank {

    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String name) {
        this.bankName = name;
        this.branchList = new ArrayList<>();
    }

    public boolean addBankBranch(String branchName){
        if(findBranch(branchName)==null) {
            this.branchList.add(new Branch(branchName));
            return true;
        }else{
            System.out.println("Branch name already Exist");
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double transaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            branch.addCustomer(customerName,transaction);
            return true;
        }
        return false;
    }
    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransaction(customerName, amount);
        }

        return false;
    }

    private Branch findBranch(String branchName){
        for(int i=0;i<branchList.size();i++){
            Branch existingBranch = branchList.get(i);
            if(existingBranch.getBranchName().equals(branchName)){
                return existingBranch;
            }
        }
        return null;
    }

}
