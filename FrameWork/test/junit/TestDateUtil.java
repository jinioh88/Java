import junit.framework.TestCase;

// TestCast 클래스 상속 방법
public class TestDateUtil extends TestCase {
	public void testGetCurTime() {
		System.out.println("Dage : "+DateUtil.getCurTime());
	}
}
