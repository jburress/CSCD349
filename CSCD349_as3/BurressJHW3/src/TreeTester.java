import holiday_decorations.BlueBall;
import holiday_decorations.ChristmasTree;
import holiday_decorations.ColoradoBlueSpruce;
import holiday_decorations.DouglasFir;
import holiday_decorations.LED;
import holiday_decorations.Lights;
import holiday_decorations.RedBall;
import holiday_decorations.Ribbons;
import holiday_decorations.Ruffles;
import holiday_decorations.SilverBall;
import holiday_decorations.Star;
import holiday_decorations.FraserFir;
import holiday_decorations.BalsamFir;
import holiday_decorations.TreeDecorator;

public class TreeTester {
	
	public static void main(String[] args)
	{
		ChristmasTree myTree = new DouglasFir();
		System.out.println("------Test: Add All -------");
		myTree = new Star(myTree);
		myTree = new Ribbons(myTree);
		myTree = new Ruffles(myTree);
		myTree = new Lights(myTree);
		myTree = new RedBall(myTree);
		myTree = new SilverBall(myTree);
		myTree = new BlueBall(myTree);
		myTree = new LED(myTree);
		System.out.println(myTree.getDescription() + " with a total cost of: $" + myTree.Cost());
		System.out.println("\n");
		System.out.println("----Test: More Than One Star -----");
		
		ChristmasTree myTree2 = new ColoradoBlueSpruce();
		myTree2 = new Star(myTree2);
		myTree2 = new Star(myTree2);
		myTree2 = new Lights(myTree2);
		myTree2 = new SilverBall(myTree2);
		System.out.println(myTree2.getDescription() + " with a total cost of: $" + myTree2.Cost());
		
		System.out.println("\n");
		System.out.println("-----Test: Different Trees ------");
		ChristmasTree myTree3 = new FraserFir();
		ChristmasTree myTree4 = new BalsamFir();
		myTree3 = new Star(myTree3);
		myTree3 = new Lights(myTree3);
		myTree4 = new LED(myTree4);
		myTree4 = new RedBall(myTree4);
		System.out.println(myTree3.getDescription() + " with a total cost of: $" + myTree3.Cost());
		System.out.println(myTree4.getDescription() + " with a total cost of: $" + myTree4.Cost());
		
		
	}//end of main

}//end of TreeTester
