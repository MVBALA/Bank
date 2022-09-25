public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

        Bank bank1 = new Bank("National Bank");

        bank1.addBranch("salakadai");

        bank1.addCustomer("salakadai", "naveen", 500.00);
        bank1.addCustomer("salakadai", "tamilarasi", 38.45);
        bank1.addCustomer("salakadai", "siva", 456.76);

        bank1.addCustomerTransaction("salakadai", "naveen", 1000.75);
        bank1.addCustomerTransaction("salakadai", "tamilarasi", 10040.75);
        bank1.addCustomerTransaction("salakad", "si", 1000.75);

        bank.listCustomers("Adelaide", true);
        System.out.println("-----------------");
        bank1.listCustomers("salakadai", false);
        System.out.println("-----------------");
        bank1.listCustomers("salakad", true);
    }
}