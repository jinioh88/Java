
public class Anonymous1 {
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV�� �Ѵ�.");
		}

		@Override
		public void turnOff() {
			System.out.println("TV�� ����.");
			
		}
	};
	
	// �޼ҵ��� ���ú����� ����
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio �Ѵ�");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio ����");
				
			}
		};
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}
