package java0707;

class Account{
    int accountNo;
    String name;
    double balance;

    public void insert(int a, String n, double amnt) {
        // 계좌 정보 입력
        this.accountNo = a;
        this.name = n;
        this.balance = amnt;
    }
    public String getName() {
        return this.name;
    }
    public double getBalance() {
        return this.balance;
    }
    public int getAccountNo() {
        return this.accountNo;
    }
    public void deposit(double amnt) {
        // amnt 금액 입금(입금내역 출력 포함) 후 잔액 출력
        this.balance += amnt;
        System.out.println(amnt + "원 입금");
        System.out.println(getName() + "님의 잔액은 " + getBalance() + "원 입니다.");
    }
    public void withdraw(double amnt) {
        // amnt 금액 출금(출금내역 출력 포함) 후 잔액 출력
        // 잔액이 부족한 경우 잔액 부족 메시지 출력
        if (this.balance < amnt) {
            System.out.println("잔액이 부족하여 출금할 수 없음!");
            checkBalance();
        }
        else {
            this.balance -= amnt;
            System.out.println(amnt + "원 출금");
            checkBalance();
        }
    }
    public void checkBalance() {
        // 현 잔액 출력
        System.out.println(getName() + "님의 잔액은: " + getBalance() + "원 입니다.");
    }
    public void display() {
        // 계좌 정보 출력
        System.out.println("--------------------------------------");
        System.out.println("계좌번호: " + getAccountNo());
        System.out.println("예금주: " + getName());
        System.out.println("잔액: " + getBalance());
        System.out.println("--------------------------------------");
    }
}
public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account();
        account.insert(11111, "코난", 10000);

        // 계좌 정보 출력(display())
        account.display();

        // 20,000 출금 시도
        account.withdraw(20000);

        // 30,000원 입금
        account.deposit(30000);

        // 1,500 출금
        account.withdraw(1500);
    }
}
