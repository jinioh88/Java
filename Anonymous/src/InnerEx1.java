// �͸� Ŭ���� ��� ��
public class InnerEx1 {
	// �͸� Ŭ����
	Object iv = new Object() {
		void method() {}
	};
	
	// �͸� Ŭ����
	static Object cv = new Object() {
		void method() {}
	};
	
	void myMethod() {
		// �͸�Ŭ����
		Object lv = new Object() { void method() {} };
	}
}
