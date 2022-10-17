public class Main {
    public static void main(String[] args) {
        Bank c1=new Bank("ABC","HDFC");
        c1.CheckBalance();
        c1.Deposit(3000);
        c1.Withdraw(2000);
        c1.CheckBalance();
        System.out.println("Returns: "+c1.FDReturns(5));
    }
}