
public class Anonymous1 {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켜다.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끄다.");
			
		}
	};
	
	// 메소드의 로컬변수로 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio 켜다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio 끄다");
				
			}
		};
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
