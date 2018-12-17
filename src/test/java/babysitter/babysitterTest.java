package babysitter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BabysitterTest {
	
	@Test
	public void shouldInitiateBabysitterClass() {
		Babysitter underTest = new Babysitter();
		assertNotNull(underTest);
	}
	
}
