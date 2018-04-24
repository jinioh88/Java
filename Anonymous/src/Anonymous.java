// 익명 자식 객체 생성
public class Anonymous {
	
	// 필드 선언과 초기값 대입
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("7시 기상");
			work();
		}
		
	};
	
	// 로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("통학");
			}

			@Override
			void wake() {
				System.out.println("8시 기상");
				walk();
			}
		};
		// 로컬 변수 이용
		localVar.wake();
		// localVar.walk();  // 익명 객체에 새롭게 정의된 메소드라 사용x. 익명객체 안에서 사용가능하다. 
	}
}
