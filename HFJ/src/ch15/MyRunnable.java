package ch15;

public class MyRunnable  implements Runnable{

	public void run() {
//		try{
//			Thread.sleep(2000);
//		}catch(InterruptedException ex){
//			ex.printStackTrace();
//		}
		go();		
	}
	
	public void go(){
		doMore();		
	}

	private void doMore() {
		System.out.println("Top");		
	}	

}

class ThreadTester implements Runnable{
	
	public static void main(String[] args){
		Runnable threadJob = new ThreadTester();
		Thread alpha = new Thread(threadJob);
		Thread beta = new Thread(threadJob);
		
		alpha.setName("a");
		beta.setName("b");
		alpha.start();
		beta.start();
	}
	
	public void run(){
		for(int i =0 ; i< 25; i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");
		}
	}
}
