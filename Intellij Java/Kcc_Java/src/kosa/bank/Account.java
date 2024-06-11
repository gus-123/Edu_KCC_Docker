package kosa.bank;

public class Account {
    private String id;
    private long balance;
    //private List<Customer> customers;

    public Account(String id, long balance) {
        super();
        this.id = id;
        this.balance = balance;
    }

    // 5번을 위해 변경
    public boolean deposit(long amount) {
        balance += amount;

        return true;
    }

    // 수정함
    public boolean withdraw(long amount) {
        if (balance < amount) {
            return false;
        }
        balance -= amount;

        return true;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public long getBalance() {
        return balance;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
}

