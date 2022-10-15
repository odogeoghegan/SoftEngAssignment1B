package softeng.assignment1.b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	// silly test to show we are testing
	@Test
	void name_should_be_assigned() {
		// given
		
	    // when
		Main.main(null);
		
		// then
		assertEquals("James Wall", Main.James.getStudentName());
	}

}
