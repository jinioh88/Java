package main;

/*
 * 자바8 부터 람다 사용이 가능해 짐.
 */
public class ram03 {
	public static void main(String[] args) {
		Runnable r = ()->{
			System.out.println("Ramda3 exe");
		};
		r.run();
	}
}
