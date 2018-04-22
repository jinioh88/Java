package main;

/*
 * 메서드 인자로 람다식 참조 변수로 사용
 */
public class ram05 {
	public static void main(String[] args) {
		MyFunc2 mf = a->a*a;    
		
		doIt(mf);
		// 다음과 같이 람다식을 한번만 사용하면 변수에 할당할 필요가 없다. 
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

