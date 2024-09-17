public Class BankAccount
{
    private String name;
    private int accountNum;
    private double balance;
    private String password;
    private boolean loggedIn;

    public BankAccount(String name, int accountNum, double balance, String password, boolean loggedIn)
    {
        this.name=name;
        this.accountNum=accountNum;
        this.balance=balance;
        this.password=password;
        this.loggedIn=false;
    }
    
    //mutator method; change val of a private instance varaible
    //change val of loggedIn but only if username and password is correct
    public boolean logIn(String name, String password)
    {
        if (username.equals(this.name)) and (password.equals(this.password))
        {
            this.loggedIn=true;
            return true;
        }
        else
        {
            return false;
        }

    }

    public void logOut()
    {

    }

    public double getBalance()
    {
        if (loggedIn==true)
        {
            return balance;
        }
        else
        {
            throw new IllegalStateException("get out ya' thieving bitch");
        }
    }
}