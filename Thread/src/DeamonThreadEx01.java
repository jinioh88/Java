// 데몬 스레드는 메인 종료되면 종료됨.
// 메인에서 호출했으므로
public class DeamonThreadEx01 implements Runnable {
	public static void main(String[] args) {
		Thread th = new Thread(new DeamonThreadEx01());
		th.setDaemon(true);
		th.start();
		
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main thread terminated...");
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("running....");
			
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
		
	}
}
