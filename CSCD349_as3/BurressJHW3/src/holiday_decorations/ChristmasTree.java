package holiday_decorations;

public abstract class ChristmasTree 
{
	String description = "Unknown Tree";
	
	public String getDescription()
	{
		return this.description + " is decorated with";
	}
	
	public abstract double Cost();
	
}
