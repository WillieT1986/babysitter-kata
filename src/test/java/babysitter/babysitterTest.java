package babysitter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class babysitterTest {
	
	@Test
	public void shouldInitiateBabysitterClass() {
		Babysitter underTest = new Babysitter();
		assertNotNull(underTest);
	}
	
}
