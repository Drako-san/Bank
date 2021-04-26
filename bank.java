import java.util.ArrayList;

public class bank{
	private ArrayList<customer> Customer;
    private int num_of_customers;
    private String BankName;

    public bank(String bankName) {
        this.BankName = bankName;
        this.num_of_customers = 0;
        this.Customer = new ArrayList<customer>();
    }

    public String getBankName() {
        return BankName;
    }

    public void addCustomer(String f, String m, String l){
        this.num_of_customers++;
        customer newCustomer = new customer(f, m, l);
        Customer.add(newCustomer);
    }
    public void addcustomer(String f, String l){
        this.num_of_customers++;
        customer newCustomer = new customer(f, l);
        Customer.add(newCustomer);
    }

    public int getNumOfCustomers(){
        return this.num_of_customers;
    }

    public customer getCustomer(int index){
        return Customer.get(index);
    }


}
