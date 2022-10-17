public class Bank implements BankFunctions{
    private String Name,BankName;
    private int sbi=5,kotak=1,hdfc=2;
    private int Balance=100000;
    Bank(String Name,String BankName){
        this.Name=Name;
        this.BankName=BankName;
    }
    @Override
    public void Withdraw(int amount) {
        if(amount<=Balance){
            Balance-=amount;
            System.out.println(amount+", withdrawal successful");
        }else{
            System.out.println("Insufficient balance, you balance is only "+Balance);
        }
    }

    @Override
    public void Deposit(int amount) {
    Balance+=amount;
        System.out.println(amount+", deposit successful");
    }

    @Override
    public void CheckBalance() {
        System.out.println("Available balance is rs, "+Balance);
    }

    @Override
    public int FDReturns(int years) {
        int rate=0;
    if(BankName=="SBI"){
        rate=sbi;
    }
    if(BankName=="KOTAK"){
        rate=kotak;
    }
    if(BankName=="HDFC"){
        rate=hdfc;
    }
    return Balance+(Balance*rate*years/100);
    }
}
