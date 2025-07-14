package java0709;

interface Bank {
    // 추상메소드
    double getBalance();
    void deposit(double amount);
    void withdraw(double amount);
    // 계좌를 생성하는 정적 메소드
    static Bank createAccount(double initialBalance) {
        return new SavingsAccount(initialBalance);
    }
    // Default 메소드
    default void displayAccountType() {
        System.out.println("Account Type: Generic");
    }
}

class SavingsAccount implements Bank {
    private double balance;
    public SavingsAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("잔액 부족");
        }
    }
    @Override
    public void displayAccountType() {
        System.out.println("계좌 타입:Savings Account");
    }
}
public class BankEx {
    public static void main(String[] args) {
        // 정적 메소드 호출
        Bank account = Bank.createAccount(1000);
        account.displayAccountType();
        //입금과 출금 실행
        account.deposit(500);
        account.withdraw(200);
        //최종 잔액 출력
        System.out.printf("최종 잔액: $" + account.getBalance());
    }
}
