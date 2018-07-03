// synchronize 
public class ThradEx02 implements Runnable {

	private int res = 0;
	
	public static void main(String[] args) {
		ThradEx02 th = new ThradEx02();
		Thread th1 = new Thread(th);
		Thread th2 = new Thread(th);  // ���� ��ü ����...
		
		th1.start();
		th2.start();
		
		try {
			th1.join();
			th2.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(th.res);
	}
	
	@Override
	public void run() {
		sum();
	}
	
	// ����ȭ�� ������ü ���� �ذ�.
	private synchronized void sum() {
		for(int i=0; i<10000; i++) {
			res++;
		}
	}
}
