import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame 
{

	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame ()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer (String playerName, GamePiece gamePiece, Location initialLocation)
	{
		playerPieces.put(playerName, gamePiece);
		playerLocations.put(playerName, initialLocation);
		return true;
	}
	
	public GamePiece getPlayerGamePiece (String playerName)
	{
		return (GamePiece) playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece (GamePiece gamePiece)
	{
		ArrayList<String> players = new ArrayList<String>();
		players.addAll(playerPieces.keySet());
		
		for (int i = 0; i < players.size(); ++i)
		{
			if(playerPieces.get(players.get(i)).equals(gamePiece))
			{
				return players.get(i);
			}
		}
		return "Not Found";
	}
	
	public void movePlayer (String playerName, Location newLocation)
	{
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers (String[] playerNames, Location[] newLocations)
	{
		String[] playerStrings = {"",""};
		playerLocations.replace(playerNames[0], newLocations[0]);
		playerLocations.replace(playerNames[1], newLocations[1]);
 		
		return playerStrings;
		
	}
	
	public Location getPlayersLocation (String player)
	{
		return (Location) playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation (Location loc)
	{
		ArrayList<String> playersAtLocation = new ArrayList<String>();
		playersAtLocation.addAll(playerLocations.keySet());
		ArrayList<String> playersToRemove = new ArrayList<String>();
		
		String currName = "";
		for (int i = 0; i < playersAtLocation.size(); ++i)
		{
			currName = playersAtLocation.get(i);
			if (!(playerLocations.get(currName).equals(loc)))
			{
				playersToRemove.add(currName);
			}
		}
		
		for (int i = 0; i < playersToRemove.size(); ++i)
		{
			playersAtLocation.remove(playersToRemove.get(i));
		}
		
		return playersAtLocation;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation (Location loc)
	{
		ArrayList<GamePiece> gamePiecesAtLocation = new ArrayList<GamePiece>();
		ArrayList<String> playersAtLocation = new ArrayList<String>();
		playersAtLocation.addAll(playerLocations.keySet());
		ArrayList<String> playersToRemove = new ArrayList<String>();
		
		String currName = "";
		for (int i = 0; i < playersAtLocation.size(); ++i)
		{
			currName = playersAtLocation.get(i);
			if (!(playerLocations.get(currName).equals(loc)))
			{
				playersToRemove.add(currName);
			}
		}
		
		for (int i = 0; i < playersToRemove.size(); ++i)
		{
			playersAtLocation.remove(playersToRemove.get(i));
		}
		
		for (int i = 0; i < playersAtLocation.size(); ++i)
		{
			gamePiecesAtLocation.add(playerPieces.get(playersAtLocation.get(i)));
		}
		
		return gamePiecesAtLocation;
	}
	
	public Set<String> getPlayers ()
	{
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations ()
	{
		ArrayList<String> players = new ArrayList<String>();
		players.addAll(playerLocations.keySet());
		Set<Location> locationSet = new HashSet<>();
		
		String currName = "";
		for (int i = 0; i < players.size(); ++i)
		{
			currName = players.get(i);
			locationSet.add(playerLocations.get(currName));
		}
		
		return locationSet;
	} 
	
	public Set<GamePiece> getPlayerPieces()
	{
		ArrayList<String> players = new ArrayList<String>();
		players.addAll(playerPieces.keySet());
		Set<GamePiece> piecesSet = new HashSet<>();
		
		String currName = "";
		for (int i = 0; i < players.size(); ++i)
		{
			currName = players.get(i);
			piecesSet.add(playerPieces.get(currName));
		}
		
		return piecesSet;
	}
	
}
