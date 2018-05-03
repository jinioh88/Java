import junit.framework.TestCase;

// 어노테이션 사용
public class TestDateUtil {
	@Test
	public void testGetCurTime() {
		System.out.println("Dage : "+DateUtil.getCurTime());
	}
}
