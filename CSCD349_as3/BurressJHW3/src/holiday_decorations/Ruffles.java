package holiday_decorations;

public class Ruffles extends TreeDecorator
{

	ChristmasTree tree;
	
	public Ruffles(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " ruffles ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 1;
	}
}
