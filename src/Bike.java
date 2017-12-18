
public class Bike extends NonMotorized
	{
		protected String name = "mountain bike";
		protected int numberOfWheels = 2;
		public void pedal()
		{
		System.out.println("You hop on the bike and decide to go for a 20 mile ride.");
		}
		public void getNumberOfWheels()
			{
			System.out.println("This " + name + " has " + numberOfWheels + " wheels.");
			}
	}
