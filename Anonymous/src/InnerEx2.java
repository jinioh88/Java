import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// �͸� Ŭ���� ��� ��
public class InnerEx2 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư ����");				
			}
		});
	}
}

