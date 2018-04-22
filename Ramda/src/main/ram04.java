package main;

/*
 * 자바8 부터 람다 사용이 가능해 짐.
 */
public class ram04 {
	public static void main(String[] args) {
		MyFunc mf = (int a) -> { return a*a ;};
		// MyFunc mf = a->a*a;   축소 가능. 
		
		int b = mf.runSomething(7);
		
		System.out.println(b);
	}
}

@FunctionalInterface
interface MyFunc{
	public abstract int runSomething(int count);
}

