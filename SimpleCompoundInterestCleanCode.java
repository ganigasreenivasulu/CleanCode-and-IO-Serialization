import java.util.*;

public class SimpleCompoundInterestCleanCode
{
    public double SInterest(double price, double r, double t)
	{
		double s;
				
		s = (price * t * r)/100;
		
		return(s);
	}
	public double CInterest(double price, double r, double t)
	{
		double c;
				
		c = price * Math.pow(1.0+r/100.0,t) - price;
		
		return(c);
	}
}