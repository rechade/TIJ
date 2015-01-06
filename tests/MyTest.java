package tests;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class MyTest {
	@Test
	public void myRunTest() {	
		int i = 3;
		org.junit.Assert.assertEquals ("assertEquals failed ",i,3);
	}	
}