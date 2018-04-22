package main;

/*
 * �޼��� ���ڷ� ���ٽ� ���� ������ ���
 */
public class ram05 {
	public static void main(String[] args) {
		MyFunc2 mf = a->a*a;    
		
		doIt(mf);
		// ������ ���� ���ٽ��� �ѹ��� ����ϸ� ������ �Ҵ��� �ʿ䰡 ����. 
		// doIt(a->a*a;);
	}
	
	public static void doIt(MyFunc2 mf) {
		int b = mf.runSomething(7);
		
		System.out.println(b);
	}
}



@FunctionalInterface
interface MyFunc2{
	public abstract int runSomething(int count);
}

