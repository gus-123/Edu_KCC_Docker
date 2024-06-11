package kosa.bank;

public class Account {
	private String id;
	private long balance; // 내가 넣을 금액
	
	public Account () {
		
	}
	
	public Account (String id, long balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public boolean deposit (long amount) {
		amount += balance;
		
		return true;
	}
	
	public boolean withdraw (long amount) {
		if (balance < amount) {
			return false;
		}
		amount -= balance;
		
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
