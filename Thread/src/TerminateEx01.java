
public class TerminateEx01 implements Runnable {

	private boolean isAlive = true;
	
	public static void main(String[] args) {
		Thread test = new Thread(new TerminateEx01(),"TEST");
		test.start();
		
		System.out.println("Ctrl+C is Exit");
	}
	
	public void shutdown() {
		System.out.println("call shutdown...");
		isAlive = false;
	}
	
	@Override
	public void run() {
		String thName = Thread.currentThread().getName();
		Thread shutDownHook = new ShutDownHook(Thread.currentThread(),"Sutdown");
		Runtime.getRuntime().addShutdownHook(shutDownHook);
		
		while(isAlive) {
			System.out.println("Running...");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println("End procedure");
		}
		System.out.println(thName+" is terminated!!");
	}
	
	private class ShutDownHook extends Thread {
		private Thread target;
		
		public ShutDownHook(Thread target, String name) {
			super(name);
			this.target = target;
		}
		
		public void run() {
			shutdown();
			try {
				target.join();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
