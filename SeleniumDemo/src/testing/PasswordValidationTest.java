package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PasswordValidationTest {

	@Test
	void test() {
		OpenStaxLoginTesting obj = new OpenStaxLoginTesting();
		String actual = obj.LoginPasswordValidate();
		assertEquals("The password you provided is incorrect.",actual);
	}
}
