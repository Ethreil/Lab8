 	
import org.junit.Assert;
import org.junit.Test;


public class GamePieceTest {

	@Test
	public void test() {
		Assert.assertEquals("Wrong Color", Color.BLUE, GamePiece.BLUE_BOOT.getColor());
		Assert.assertEquals("Wrong Color", Shape.BOOT, GamePiece.BLUE_BOOT.getShape());
		
		if (!(GamePiece.RED_RACER.movesFirst(GamePiece.RED_RACER, GamePiece.BLUE_RACER).equals(GamePiece.RED_RACER)))
		{
			System.out.println("Wrong Move Priority");
		}
			
		Assert.assertEquals("Wrong String", "A BLUE BOOT", "A " + GamePiece.BLUE_BOOT.getColor() + " " + GamePiece.BLUE_BOOT.getShape());
		
	}

}
