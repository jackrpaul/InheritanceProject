
public class Car extends Motorized
	{
		protected String name = "Kia Soul";
		protected int numberOfWheels = 4;
		public void startUp()
		{
		System.out.println("You turn the key in the " + name + " and it starts up.");
		}
		public void getNumberOfWheels()
		{
		System.out.println("This " + name + " has " + numberOfWheels + " wheels.");
		}
		public void drift()
		{
		System.out.println("Sick drift bro! You're practically the Baby Driver!");
		}
	}
