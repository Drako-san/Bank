public class customer{
    private String FirstName;
    private String MiddleName;
    private String LastName;
    private account Account;

    public customer(String f, String m, String l){
        this.FirstName = f;
        this.MiddleName = m;
        this.LastName = l;
        this.Account = new account(0);
    }
    public customer(String f, String l){
        this.FirstName = f;
        this.LastName = l;
        this.Account = new account(0);
    }

    public String getFirstName() {
        return FirstName;
    }
    
    public String getMiddleName() {
    	return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public account getAccount() {
        return Account;
    }

    public void setAccount(account Account) {
        this.Account = Account;
    }

}
