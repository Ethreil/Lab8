
import org.junit.Assert;
import org.junit.Test;



public class ShapeTest {

	@Test
	public void test() {
		Assert.assertEquals("Shape toString is incorrect.","THIMBLE", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString is incorrect.","RACECAR", Shape.RACECAR.toString());
		Assert.assertEquals("Shape toString is incorrect.","BOOT", Shape.BOOT.toString());
	}

}
