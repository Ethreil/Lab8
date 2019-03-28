
public enum Shape 
{

	THIMBLE,
	BOOT,
	RACECAR;

	public String toString()
	{
		if (this.equals(RACECAR))
		{
		return "RACECAR";	
		}
		
		if (this.equals(BOOT))
		{
		return "BOOT";	
		}
		
		if (this.equals(THIMBLE))
		{
		return "THIMBLE";	
		}
		
		return "Not Found";
	}
	
}
