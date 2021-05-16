package ThreadPackage;

public class MyThread extends Thread{
	
	static Thread tm;
	
	public void run(){
		wish();
		
	}
	public synchronized void wish() {
		/*
		 * try { tm.join();//if child thread wants to wait for main thread } catch
		 * (InterruptedException e1) { 
		 * e1.printStackTrace(); }
		 */
		for(int i = 0; i < 10; i++) {//Task of the child thread
			System.out.println("child thread:"+Thread.currentThread().getName());
			//Thread.yield();
			
			 /*try { 
				 Thread.sleep(1000); 
			 } catch (InterruptedException e) {
				 e.printStackTrace(); 
			 }*/
			 
		}
		
	}
}
