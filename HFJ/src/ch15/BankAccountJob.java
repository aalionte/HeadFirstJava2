package ch15;

public class BankAccountJob implements Runnable{

	private BankAccount account = new BankAccount();
	
	public static void main(String[] args){
		BankAccountJob job = new BankAccountJob();
		Thread one = new Thread(job);
		Thread two = new Thread(job);
		one.setName("rob");
		two.setName("monica");
		one.start();
		two.start();
	}
	
	public void run(){
		for (int i = 0; i < 10 ; i ++){
			makeWithdrawal(10);
			if(account.getBalance() < 0){
				System.out.println("Overdrawn!");
			}
		}
	}
	
	private void makeWithdrawal(int amount){
		if(account.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName() + " is about to withdraw");
			try{
				System.out.println(Thread.currentThread().getName() + " is going to sleep");
				Thread.sleep(500);
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName()+ " woke up");
		account.withdraw(amount);
		System.out.println(Thread.currentThread().getName()+ " completes the withdrawl");
		}
		else{
			System.out.println("Not enough for "+ Thread.currentThread().getName());
		}
	}
}
