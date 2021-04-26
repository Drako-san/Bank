import java.util.Scanner;

public class driver {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        bank Bank = new bank("Bank Real One (BRO)");
        System.out.println("Welcome to " + Bank.getBankName());

        //While loop for the menu
        while (true){

            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println();

            //Switch cases depending on the choice that is made
            switch(choice){
                case 1:
                	System.out.println("New customer details");
                	System.out.println("Do you have a middle name? [Y/N]");
                	System.out.print("Your choice: ");
                	char Mid = sc.next().charAt(0);
                	sc.nextLine();
                	switch(Mid){
                	case 'Y' -> {
                		System.out.print("Enter customer's first name: ");
                        String fName = sc.nextLine();
                        System.out.print("Enter customer's middle name: ");
                        String mName = sc.nextLine();
                        System.out.print("Enter customer's last name: ");
                        String lName = sc.nextLine();
                        //adds customer into list of customers in bank class
                        Bank.addCustomer(fName, mName, lName);
                        System.out.println(fName + " " + mName + " " + lName + " has been added as a new customer.");
                	}
                	case 'N' -> {
                		System.out.print("Enter customer's first name: ");
                        String fName = sc.nextLine();
                        System.out.print("Enter customer's last name: ");
                        String lName = sc.nextLine();
                        //adds customer into list of customers in bank class
                        Bank.addcustomer(fName, lName);
                        System.out.println(fName + " " + lName + " has been added as a new customer.");
                	}
                	}
                	break;      
                case 2:
                    //Makes sure customer number is not 0
                    if (Bank.getNumOfCustomers() != 0){
                        System.out.println("Customer List");
                        System.out.println("====================");
                        for (int i = 0; i < Bank.getNumOfCustomers(); i++){
                            System.out.print((i+1) + ". ");
                            System.out.println(Bank.getCustomer(i));
                        }
                    }else{
                        System.out.println("No customer added yet.");
                    }
                    System.out.println();
                    break;
                case 3:
                    //Make sure customer is not equal 0
                    if (Bank.getNumOfCustomers() != 0){
                        System.out.print("Input customer number: ");
                        int num = sc.nextInt();
                        sc.nextLine();
                        //get the details of a customer using index - 1 because the display starts from 1
                        customer accCustomer = Bank.getCustomer(num-1);
                        System.out.println("What to do in " + accCustomer + " bank.");
                        System.out.println("1. Withdraw");
                        System.out.println("2. Deposit");
                        System.out.print("Your choice: ");
                        int acc = sc.nextInt();
                        sc.nextLine();
                        //Another switch case to deal with the choice that is made
                        switch (acc) {
                            case 1 -> {
                                System.out.print("Enter the value to withdraw: ");
                                double amount_withdraw = sc.nextDouble();
                                sc.nextLine();
                                boolean check = accCustomer.getAccount().withdraw(amount_withdraw);
                                //checks if the method returns true or false (successful or failed)
                                if (check) {
                                    System.out.println("New balance: " + accCustomer.getAccount().getBalance());
                                } else {
                                    System.out.println("Balance not enough or input is negative.");
                                }
                            }
                            case 2 -> {
                                System.out.print("Enter the value to deposit: ");
                                double amount_deposit = sc.nextDouble();
                                sc.nextLine();
                                boolean check = accCustomer.getAccount().deposit(amount_deposit);
                                if (check) {
                                    System.out.println("New balance: " + accCustomer.getAccount().getBalance());
                                } else {
                                    System.out.println("Input cannot be less than 0.");
                                }
                            }
                            default -> System.out.println("Invalid input.");
                        }
                    }else {
                        System.out.println("No customer added yet.");
                    }
                    break;
                case 4:
                    //Exits the program
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input not available.");
            }

        }
    }

    public static void menu(){
        //The Menu
        System.out.println("=======================");
        System.out.println("1. Add customer");
        System.out.println("2. Get customer list");
        System.out.println("3. Customer deposit/withdraw");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
    }
}
