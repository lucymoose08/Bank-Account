public class Test
{
    public static void main(String[] args)
    {
        BankAccount savings = new BankAccount ("lpenuel", 696969, 150.55, "rowie", false);
        System.out.println(savings);
        
        savings.logIn("lpenuel","rowie");
        System.out.println(savings.getBalance());
        savings.deposit(25.00);
        System.out.println(savings.getBalance());
    }
}
