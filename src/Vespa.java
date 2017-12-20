
public class Vespa extends Motorized
	{
		protected String name = "Vespa";
		protected int numberOfWheels = 2;
		public void startUp()
		{
		System.out.println("You start up the " + name + ".");
		}
		public void getNumberOfWheels()
		{
		System.out.println("This " + name + " has " + numberOfWheels + " wheels.");
		}
		public void cruise()
		{
		System.out.println("It's almost like I'm on the streets of Rome...");
		}
		public void buy()
		{
		System.out.println("Wow! That fancy new " + name + " ran you $350!");
		}
	}
