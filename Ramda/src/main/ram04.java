package main;

/*
 * �ڹ�8 ���� ���� ����� ������ ��.
 */
public class ram04 {
	public static void main(String[] args) {
		MyFunc mf = (int a) -> { return a*a ;};
		// MyFunc mf = a->a*a;   ��� ����. 
		
		int b = mf.runSomething(7);
		
		System.out.println(b);
	}
}

@FunctionalInterface
interface MyFunc{
	public abstract int runSomething(int count);
}

