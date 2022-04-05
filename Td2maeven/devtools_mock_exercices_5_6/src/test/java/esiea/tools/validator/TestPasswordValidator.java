package esiea.tools.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/* UNCOMMENT THIS CLASS WHEN WORKING ON THE CORRESPONDING EXERCISE */



class TestPasswordValidator {

	@Test
	void TestValidator() {
		PasswordValidator pv = new PasswordValidator();
		//less than 6
		assertTrue(pv.validatePassword("azertyui1"));
        assertFalse(pv.validatePassword("123a"));
		//add here other tests according to specification
	}

}

