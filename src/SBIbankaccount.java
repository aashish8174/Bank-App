public class SBIbankaccount implements BAnkaccount{

    private int balance;

    public SBIbankaccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdrawMoney(int money) {
        if(this.balance>=money) {
            this.balance = this.balance - money;
            return true;
        }
        return false;
    }
}
