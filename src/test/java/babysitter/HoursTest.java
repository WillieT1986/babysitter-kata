package babysitter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class HoursTest {
	
	@Test
	public void ShouldConstructWorkingHours() {
		Hours underTest = new Hours();
		assertNotNull(underTest);
	}
	
}
