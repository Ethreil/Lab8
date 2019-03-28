
import org.junit.Assert;
import org.junit.Test;

public class LocationTest {

	@Test
	public void test() {
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Zer0", GamePiece.RED_RACER, Location.BALLROOM);
		Assert.assertEquals("Wrong Location", Location.BALLROOM, bg.getPlayersLocation("Zer0"));
	
		bg.movePlayer("Zer0", Location.BILLIARD_ROOM);
		Assert.assertEquals("Wrong Location", Location.BILLIARD_ROOM, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.CONSERVATORY);
		Assert.assertEquals("Wrong Location", Location.CONSERVATORY, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.DINING_ROOM);
		Assert.assertEquals("Wrong Location", Location.DINING_ROOM, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.HALL);
		Assert.assertEquals("Wrong Location", Location.HALL, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.KITCHEN);
		Assert.assertEquals("Wrong Location", Location.KITCHEN, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.LIBRARY);
		Assert.assertEquals("Wrong Location", Location.LIBRARY, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.LOUNGE);
		Assert.assertEquals("Wrong Location", Location.LOUNGE, bg.getPlayersLocation("Zer0"));
		bg.movePlayer("Zer0", Location.STUDY);
		Assert.assertEquals("Wrong Location", Location.STUDY, bg.getPlayersLocation("Zer0"));
		
	}

}
