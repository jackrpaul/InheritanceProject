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
			Vespa v = new Vespa();
			Vehicle r = new Rollerskates();
			for(int i = 0; i < 4; i++)
				{
				if(i == 0)
					{
					c.haveInsurance();
					c.repair();
					c.startUp();
					c.drift();
					c.getNumberOfWheels();
					System.out.println();
					}
				else if(i == 1)
					{
					b.haveInsurance();
					b.repair();
					(Bike(b)).pedal();
					System.out.println();
					}
				else if (i == 2)
					{
					v.haveInsurance();
					v.repair();
					System.out.println();
					}
				else
					{
					r.haveInsurance();
					r.repair();
					System.out.println();
					}
				}
				
			}

	}
