package java0708.Ex01;

class Account{
    private String id;
    private String name;
    private int balance = 0;

    public Account() {}
    public Account(String id, String name) {
        this(id, name, 0);
    }

    // 가장 완전한 생성자는 직접 필드 초기화해야 함
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int deposit(int amount) {
        balance += amount;
        System.out.printf("%s님이 %d원을 입금하였음\n", name, amount);
        return balance;
    }
    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("%s님이 %d원을 출금하였음\n", name, amount );
        }
        else {
            System.out.println("출금액이 잔액초과");
        }
        return balance;
    }
    public int transferTo(Account another, int amount) {
        System.out.printf("%s이 %s에게 %d원 송금 시도\n", this.name, another.getName(), amount);
        if (amount <= balance) {
            balance -= amount;
            another.deposit(amount);
            System.out.printf("%s님이 %s님에게 %d원을 송금하였음\n", this.name, another.getName(), amount);
        }
        else {
            System.out.println("송금액이 잔액 초과!!");
        }
        return balance;
    }
    public String toString() {
        return String.format("Account[id=%s, name=%s, balance=%d]\n", id, name, balance);
    }

}
public class AccountEx {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new Account();
        accounts[0].setId("11-111-111");
        accounts[0].setName("코난");
        accounts[0].setBalance(20000);

        accounts[1] = new Account("22-222-222", "장미");
        accounts[1].setBalance(100000);

        accounts[2] = new Account("33-33-333", "미란", 50000);

        System.out.println("초기 계좌 정보");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
        System.out.println("-----------------------------------------------------");
        accounts[0].transferTo(accounts[1], 30000);
        accounts[0].deposit(50000);
        accounts[0].transferTo(accounts[1], 30000);
        accounts[2].withdraw(4500);
        System.out.println("-----------------------------------------------------");
        System.out.println("은행 업무 이후 계좌 정보");
        for (Account account : accounts) {
            System.out.println(account.toString());
        }
    }
}
