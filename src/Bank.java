import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        } else
            return false;

    }

    public boolean addCustomer(String branchName, String customerName, double intialAmount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            existingBranch.newCustomer(customerName, intialAmount);
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            existingBranch.addCustomerTransaction(customerName, amount);
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkBranches = this.branches.get(i);
            if (checkBranches.getName().equals(branchName)) {
                return checkBranches;
            }
        }
        return null;

    }

    public boolean listCustomers(String branchName, boolean print) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> branchCustomer = branch.getCustomers();
            for (int i = 0; i < branchCustomer.size(); i++) {
                Customer customer = branchCustomer.get(i);
                System.out.println("Customer:" + customer.getName() + "[" + (i + 1) + "]");
                if (print) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else
            return false;

    }
}
