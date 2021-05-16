package ThreadPackage;

public class ThreadMain {
	
	public static void main(String args[]) throws InterruptedException{
		
		MyThread.tm = Thread.currentThread();
		
		MyThread th = new MyThread();//Main thread creates the child thread
		th.start();// Main thread started the child thread..now we have 2 threads
		MyThread th1 = new MyThread();//Main thread creates the child thread
		th1.start();
		//th.join();
		/*
		 * for(int i = 0; i < 10; i++) {
		 * System.out.println("main thread:"+Thread.currentThread().getName()); }
		 */
	} 
}
