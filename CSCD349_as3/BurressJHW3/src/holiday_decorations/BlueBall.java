package holiday_decorations;

public class BlueBall extends TreeDecorator
{

ChristmasTree tree;
	
	public BlueBall(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " blue ball ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 2;
	}
}
