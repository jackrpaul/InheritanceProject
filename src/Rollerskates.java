
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
		System.out.println("Each " + name.substring(0, name.length() - 1) + " has " + numberOfWheels / 2 + " wheels on it.");
		}
		public void buy()
		{
		System.out.println("Wow! Those fancy new " + name + " ran you $70!");
		}
	}
