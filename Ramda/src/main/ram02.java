package main;

/*
 * 익명 객체 사용 
 */

public class ram02 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Lamda2 exe");
			}
		};
		
		r.run();
	}

}
