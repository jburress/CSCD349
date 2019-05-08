package holiday_decorations;

public class LED extends TreeDecorator
{

ChristmasTree tree;
	
	public LED(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " LED's ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 10;
	}
}
