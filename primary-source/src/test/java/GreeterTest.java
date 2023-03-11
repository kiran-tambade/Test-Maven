import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

import com.kiran.Greeter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
public class GreeterTest {
public Greeter greeter;
	@Before	
	public void test() {
		greeter=new Greeter();
	}
	@SuppressWarnings("deprecation")
	@Test
	public void greetShouldIncluedWhoIsGreated()
	{
		String someone="World";
		assertThat(greeter.greet(someone),containsString(someone));
		System.out.println("Successful gtihub");
	}


}
