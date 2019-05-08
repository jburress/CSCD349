package holiday_decorations;

public class Ribbons extends TreeDecorator
{
ChristmasTree tree;
	
	public Ribbons(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		return tree.getDescription() + " ribbons ,";
	}
	
	public double Cost()
	{
		return tree.Cost() + 2;
	}

}
