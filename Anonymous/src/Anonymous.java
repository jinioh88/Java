// �͸� �ڽ� ��ü ����
public class Anonymous {
	
	// �ʵ� ����� �ʱⰪ ����
	Person field = new Person() {
		void work() {
			System.out.println("���");
		}

		@Override
		void wake() {
			System.out.println("7�� ���");
			work();
		}
		
	};
	
	// ���� ���������� ����
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("����");
			}

			@Override
			void wake() {
				System.out.println("8�� ���");
				walk();
			}
		};
		// ���� ���� �̿�
		localVar.wake();
		// localVar.walk();  // �͸� ��ü�� ���Ӱ� ���ǵ� �޼ҵ�� ���x. �͸�ü �ȿ��� ��밡���ϴ�. 
	}
}
