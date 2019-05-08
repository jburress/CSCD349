package holiday_decorations;

public class SilverBall extends TreeDecorator
{
ChristmasTree tree;
	
	public SilverBall(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " silver ball ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 3;
	}

}
