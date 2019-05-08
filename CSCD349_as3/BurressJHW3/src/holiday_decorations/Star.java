package holiday_decorations;

public class Star extends TreeDecorator
{

	ChristmasTree tree;
	boolean StarHelper = false;
	
	public Star(ChristmasTree tree)
	{
		this.tree = tree;
	}
	
	public String getDescription()
	{
		if(CheckForStar() == true)
		{
		StarHelper = true;
		return tree.getDescription() + " star ,";
		}
		return tree.getDescription() + "";
	}
	
	public double Cost()
	{
		if(StarHelper == true)
		{
			return tree.Cost() + 4;
		}
		return tree.Cost()+0;
	}
	
	public boolean CheckForStar()
	{
		if(tree.getDescription().contains("star"))
		{
			System.out.println("There is already a star on that tree!");
			return false;
		}
		else
		return true;
	}
}
