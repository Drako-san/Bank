public class account{
    private double balance;

    public account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean withdraw(double amount){
        if (amount > 0){
            if (this.balance >= amount){
                this.balance -= amount;
                return true;
            } 
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
}

