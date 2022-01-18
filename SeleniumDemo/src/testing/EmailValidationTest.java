package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidationTest {

	@Test
	void test() {
		OpenStaxLoginTesting obj = new OpenStaxLoginTesting();
		String actual = obj.LoginEmailValidate();
		assertEquals("We could not find your account. Please try again.",actual);
	}

}
