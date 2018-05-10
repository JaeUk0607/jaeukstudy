import java.util.ArrayList;
import java.util.HashMap;

class Bank{
	HashMap<String, Account> account = new HashMap<>();
	int totalAccount;
	public Bank() {
		
			
		
	}
	public void addAccount(String accountNo, String name){
		account.put(accountNo, new Account(accountNo, name));
	}
	public Account getAccount(String accountNo) {
		return account.get(accountNo);
	}
	public Account findAccount(String name) {
		return null;
	}
	
}

class Account{
	String accountNo;
	String name;
	long balance;
//	Transaction t = new Transaction();
	ArrayList<Transaction> tra = new ArrayList<>();
	Account(){
		
	}
	

	Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}
	public void deposit(long amount) {
		this.balance += amount;
		tra.add(new Transaction("18.02.14","11:24","입금",amount));
		System.out.println("입금금액은 : " + amount);
		System.out.println("잔액은 : " + this.balance);
	}
	public void withdraw(long amount) {
		
		this.balance -= amount;
		tra.add(new Transaction("18.02.14","11:24","출금",amount));
		System.out.println("출금금액은 : " + amount);
		System.out.println("잔액은 : " +this.balance);
	}
	public void getBalance() {
		System.out.println("잔액은 : " + this.balance);
		
	}
	public ArrayList<Transaction> getTransaction(){
		return tra;
		
	}
	
	
}
class Transaction{
	String transactionDate;
	String trasactionTime;
	String kind;
	long amount;
	
	public Transaction(String transactionDate, String trasactionTime, String kind, long amount) {
		super();
		this.transactionDate = transactionDate;
		this.trasactionTime = trasactionTime;
		this.kind = kind;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionDate=" + transactionDate + ", trasactionTime=" + trasactionTime + ", kind="
				+ kind + ", amount=" + amount + "]";
	}
	

}

public class Ex17_Bank {
	public static void main(String[] args) {
		
		Account acc = new Account();
		acc.balance = 123456789;
		acc.deposit(100);
		ArrayList<Transaction> t1= acc.getTransaction();
		for(Transaction q : t1) {
			System.out.println(q.toString());
		}
		acc.withdraw(5000);
		for(Transaction q : t1) {
			System.out.println(q.toString());
		}
		
		
	}

}
