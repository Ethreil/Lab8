
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {

	@Test
	public void test() {
		BoardGame bg = new BoardGame();
		
		bg.addPlayer("Karla", GamePiece.BLUE_BOOT, Location.LIBRARY);
		bg.addPlayer("Joel", GamePiece.BLUE_RACER, Location.BALLROOM);
		bg.addPlayer("John", GamePiece.GREEN_BOOT, Location.BILLIARD_ROOM);
		bg.addPlayer("Matt", GamePiece.MAGENTA_RACER, Location.CONSERVATORY);
		bg.addPlayer("Ryan", GamePiece.RED_RACER, Location.DINING_ROOM);
		bg.addPlayer("Ashley", GamePiece.RED_THIMBLE, Location.HALL);
		
		Assert.assertEquals("Wrong Player", "Karla", bg.getPlayerWithGamePiece(GamePiece.BLUE_BOOT));
		Assert.assertEquals("Wrong Player", "Joel", bg.getPlayerWithGamePiece(GamePiece.BLUE_RACER));
		Assert.assertEquals("Wrong Player", "John", bg.getPlayerWithGamePiece(GamePiece.GREEN_BOOT));
		Assert.assertEquals("Wrong Player", "Matt", bg.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER));
		Assert.assertEquals("Wrong Player", "Ryan", bg.getPlayerWithGamePiece(GamePiece.RED_RACER));
		Assert.assertEquals("Wrong Player", "Ashley", bg.getPlayerWithGamePiece(GamePiece.RED_THIMBLE));
		
		Assert.assertEquals("Player Incorrectly Not Found", "Not Found", bg.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
	
		Assert.assertEquals("Wrong location", Location.LIBRARY, bg.getPlayersLocation("Karla"));
		Assert.assertEquals("Wrong location", Location.BALLROOM, bg.getPlayersLocation("Joel"));
		Assert.assertEquals("Wrong location", Location.BILLIARD_ROOM, bg.getPlayersLocation("John"));
		Assert.assertEquals("Wrong location", Location.CONSERVATORY, bg.getPlayersLocation("Matt"));
		Assert.assertEquals("Wrong location", Location.DINING_ROOM, bg.getPlayersLocation("Ryan"));
		Assert.assertEquals("Wrong location", Location.HALL, bg.getPlayersLocation("Ashley"));
			
		Assert.assertEquals("Wrong Game Piece", GamePiece.BLUE_BOOT, bg.getPlayerGamePiece("Karla"));
		Assert.assertEquals("Wrong Game Piece", GamePiece.BLUE_RACER, bg.getPlayerGamePiece("Joel"));
		Assert.assertEquals("Wrong Game Piece", GamePiece.GREEN_BOOT, bg.getPlayerGamePiece("John"));
		Assert.assertEquals("Wrong Game Piece", GamePiece.MAGENTA_RACER, bg.getPlayerGamePiece("Matt"));
		Assert.assertEquals("Wrong Game Piece", GamePiece.RED_RACER, bg.getPlayerGamePiece("Ryan"));
		Assert.assertEquals("Wrong Game Piece", GamePiece.RED_THIMBLE, bg.getPlayerGamePiece("Ashley"));

		bg.movePlayer("Karla", Location.STUDY);
		bg.movePlayer("Joel", Location.LOUNGE);
		bg.movePlayer("John", Location.KITCHEN);
		bg.movePlayer("Matt", Location.HALL);
		bg.movePlayer("Ryan", Location.DINING_ROOM);
		bg.movePlayer("Ashley", Location.CONSERVATORY);
		
		Assert.assertEquals("Wrong location", Location.STUDY, bg.getPlayersLocation("Karla"));
		Assert.assertEquals("Wrong location", Location.LOUNGE, bg.getPlayersLocation("Joel"));
		Assert.assertEquals("Wrong location", Location.KITCHEN, bg.getPlayersLocation("John"));
		Assert.assertEquals("Wrong location", Location.HALL, bg.getPlayersLocation("Matt"));
		Assert.assertEquals("Wrong location", Location.DINING_ROOM, bg.getPlayersLocation("Ryan"));
		Assert.assertEquals("Wrong location", Location.CONSERVATORY, bg.getPlayersLocation("Ashley"));
		 
		String[] names1 = {"Karla","Joel"};
		Location[] locations1 = {Location.STUDY,Location.LOUNGE};
		bg.moveTwoPlayers(names1, locations1);
		String[] names2 = {"John","Matt"};
		Location[] locations2 = {Location.KITCHEN,Location.HALL};
		bg.moveTwoPlayers(names2, locations2);
		String[] names3 = {"Ryan","Ashley"};
		Location[] locations3 = {Location.BALLROOM,Location.CONSERVATORY};
		bg.moveTwoPlayers(names3, locations3);
		
		Assert.assertEquals("Wrong location", Location.STUDY, bg.getPlayersLocation("Karla"));
		Assert.assertEquals("Wrong location", Location.LOUNGE, bg.getPlayersLocation("Joel"));
		Assert.assertEquals("Wrong location", Location.KITCHEN, bg.getPlayersLocation("John"));
		Assert.assertEquals("Wrong location", Location.HALL, bg.getPlayersLocation("Matt"));
		Assert.assertEquals("Wrong location", Location.BALLROOM, bg.getPlayersLocation("Ryan"));
		Assert.assertEquals("Wrong location", Location.CONSERVATORY, bg.getPlayersLocation("Ashley"));

		bg.movePlayer("Karla", Location.KITCHEN);
		bg.movePlayer("Joel", Location.KITCHEN);
		bg.movePlayer("John", Location.KITCHEN);
		
		ArrayList<String> playersInKitchen = bg.getPlayersAtLocation(Location.KITCHEN);
		
		if (!(playersInKitchen.get(0).equals("Karla")))
		{
			if (!(playersInKitchen.get(0).equals("Joel")))
			{
				if (!(playersInKitchen.get(0).equals("John")))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		if (!(playersInKitchen.get(1).equals("Karla")))
		{
			if (!(playersInKitchen.get(1).equals("Joel")))
			{
				if (!(playersInKitchen.get(1).equals("John")))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		if (!(playersInKitchen.get(2).equals("Karla")))
		{
			if (!(playersInKitchen.get(2).equals("Joel")))
			{
				if (!(playersInKitchen.get(2).equals("John")))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		ArrayList<GamePiece> gamePiecesInKitchen = bg.getGamePiecesAtLocation(Location.KITCHEN);
		
		if (!(gamePiecesInKitchen.get(0).equals(GamePiece.BLUE_BOOT)))
		{
			if (!(gamePiecesInKitchen.get(0).equals(GamePiece.BLUE_RACER)))
			{
				if (!(gamePiecesInKitchen.get(0).equals(GamePiece.GREEN_BOOT)))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		if (!(gamePiecesInKitchen.get(1).equals(GamePiece.BLUE_BOOT)))
		{
			if (!(gamePiecesInKitchen.get(1).equals(GamePiece.BLUE_RACER)))
			{
				if (!(gamePiecesInKitchen.get(1).equals(GamePiece.GREEN_BOOT)))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		if (!(gamePiecesInKitchen.get(2).equals(GamePiece.BLUE_BOOT)))
		{
			if (!(gamePiecesInKitchen.get(2).equals(GamePiece.BLUE_RACER)))
			{
				if (!(gamePiecesInKitchen.get(2).equals(GamePiece.GREEN_BOOT)))
				{
					System.out.println("Wrong Player");
				}
			}
		}
		
		Set<String> playersInGame = bg.getPlayers();
		
		Assert.assertTrue(playersInGame.contains("Karla"));
		Assert.assertTrue(playersInGame.contains("Joel"));
		Assert.assertTrue(playersInGame.contains("John"));
		Assert.assertTrue(playersInGame.contains("Matt"));
		Assert.assertTrue(playersInGame.contains("Ryan"));
		Assert.assertTrue(playersInGame.contains("Ashley"));

		Set<Location> playerLocations = bg.getPlayerLocations();
		Set<GamePiece> playerPieces = bg.getPlayerPieces();
		/*
		String[] playersArray = (String[]) playersInGame.toArray();
		Location[] playerLocationsArray = (Location[]) playerLocations.toArray();
		GamePiece[] playerPiecesArray = (GamePiece[]) playerPieces.toArray();
		
		LinkedHashMap<String, Location> playersToLocationMap = new LinkedHashMap<String, Location>();
		LinkedHashMap<String, GamePiece> playersToPieceMap = new LinkedHashMap<String, GamePiece>();
		LinkedHashMap<GamePiece, Location> gamePieceToLocationMap = new LinkedHashMap<GamePiece, Location>();
		*/
		
	}

}
