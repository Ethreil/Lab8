
import org.junit.Assert;

public class Driver 
{
	
	
	public static void main (String[] args)
	{
	//	BoardGame game = new BoardGame();
		
	//	game.addPlayer("Karla", RED_RACER, KITCHEN);
		
		Color col = null;
		col = Color.RED;
		
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
	
	}

}
