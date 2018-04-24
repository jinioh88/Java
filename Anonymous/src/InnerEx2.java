import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 익명 클래스 사용 후
public class InnerEx2 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼 누름");				
			}
		});
	}
}

