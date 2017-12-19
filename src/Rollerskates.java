
public class Rollerskates extends NonMotorized
	{
		protected String name = "rollerskates";
		protected int numberOfWheels = 8;
		public void skate()
		{
		System.out.println("You put on the skates and go roam the streets of Denver.");
		}
		public void getNumberOfWheels()
		{
		System.out.println("This " + name + " has " + numberOfWheels + " wheels.");
		}
	}
