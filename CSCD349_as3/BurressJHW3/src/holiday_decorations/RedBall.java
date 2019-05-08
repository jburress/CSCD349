package holiday_decorations;

public class RedBall extends TreeDecorator
{
ChristmasTree tree;
	
	public RedBall(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " red ball ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 1;
	}

}
