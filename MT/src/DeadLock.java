
public class DeadLock {
	
	
	public static void main(String[] args) {
		
		
		final String resource1="Scanner";
		
		final String resource2="Printer";
		
		Runnable run1= () -> {
			synchronized(resource1) {
				System.out.println(Thread.currentThread().getName() + " Locked " + resource1);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized(resource2) {
					
					System.out.println(Thread.currentThread().getName() + " Locked " + resource2);
					
				}
			}
		};
		
		Runnable run2= () -> {
			synchronized(resource2) {
				System.out.println(Thread.currentThread().getName() + " Locked " + resource2);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized(resource1) {
					
					System.out.println(Thread.currentThread().getName() + " Locked " + resource1);
					
				}
			}
		};
		
		Thread th1 =new Thread(run1);
		
		th1.setName("Desktop");
		
		Thread th2 =new Thread(run2);
		
		th2.setName("Laptop");
		
		th1.start();
		th2.start();
	}

}
