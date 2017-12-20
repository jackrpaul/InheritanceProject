import java.util.*;
import java.io.*;

public class runner
	{
		
		public static void main(String[] args)
			{
			doStuff();
			}
		
		private static void doStuff()
			{
			Car c = new Car();
			Vehicle b = new Bike();
			Motorized v = new Vespa();
			Vehicle r = new Rollerskates();
			for(int i = 0; i < 4; i++)
				{
				if(i == 0)
					{
					c.buy();
					c.haveInsurance();
					c.repair();
					c.startUp();
					c.drift();
					c.getNumberOfWheels();
					System.out.println();
					}
				else if(i == 1)
					{
					b.buy();
					b.haveInsurance();
					b.repair();
					((Bike)b).showOffToFriends();
					((Bike)b).pedal();
					((Bike)b).getNumberOfWheels();
					System.out.println();
					}
				else if (i == 2)
					{
					v.buy();
					v.haveInsurance();
					v.repair();
					((Vespa)v).cruise();
					((Vespa)v).revEngine();
					System.out.println();
					}
				else
					{
					r.buy();
					r.haveInsurance();
					r.repair();
					((Rollerskates)r).skate();
					((Rollerskates)r).getNumberOfWheels();
					System.out.println();
					}
				}
				
			}

	}
