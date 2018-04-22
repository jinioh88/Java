package main;

/*
 *  기존 방식
 */
public class ram01 {
	public static void main(String[] args) {
		MyTest mt = new MyTest();
		
		Runnable r = mt;
		
		r.run();
	}
}

class MyTest implements Runnable{
	public void run() {
		System.out.println("Lamda exe!");
	}
}
