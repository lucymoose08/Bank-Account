public class BankAccount
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
        if (name.equals(this.name) && password.equals(this.password))
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
        loggedIn=false;
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

    public double deposit(double amount)
    {
        if (loggedIn == true)
        {
            this.balance+=amount;
            return balance;
        }
        else
        {
            throw new IllegalStateException("I'd gladly steal your money but I bet you'd sue me");
        }
    }

    public double withdrawal(double amount)
    {
        if (loggedIn == true)
        {
            this.balance-=amount;
            return balance;
        }
        else
        {
            throw new IllegalStateException("stop trying to steal that poor old lady's money");
        }
    }

    public String toString()
    {
        if (loggedIn==false)
        {
            return "log in to access Account Number " + this.accountNum;
        }
        else
        {
            return "Account Number: " + this.accountNum + ", Balance: " + this.balance;
        }
    }
}