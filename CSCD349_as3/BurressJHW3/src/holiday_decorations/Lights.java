package holiday_decorations;

public class Lights extends TreeDecorator
{
ChristmasTree tree;
	
	public Lights(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " lights ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 5;
	}

}
