
import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void test() {
		GamePieceAppearance appearance = new GamePieceAppearance(Color.BLUE,Shape.BOOT);
		Assert.assertEquals("Wrong Color", Color.BLUE,  appearance.getColor());
		Assert.assertEquals("Wrong Shape", Shape.BOOT,  appearance.getShape());
	}

}
