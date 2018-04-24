// 익명 클래스 사용 예
public class InnerEx1 {
	// 익명 클래스
	Object iv = new Object() {
		void method() {}
	};
	
	// 익명 클래스
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		// 익명클래스
		Object lv = new Object() { void method() {} };
	}
}
