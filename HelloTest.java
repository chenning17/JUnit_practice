import org.junit.Test;
//import org.junit.Ignore;
import static org.junit.Assert.*;

public class HelloTest {
	//@Ignore
	@Test
	public void testPrintHello() {
		Hello hello = new Hello();
		
		String result = hello.printHello();
		assertEquals("hello\n", result);
	}

}
