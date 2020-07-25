import java.util.*;

public class HouseConstructCleanCode
{
    public double ConstructCost(String stnd, double area, boolean auto)
	{
		double price=0;
		if(stnd == "standard" && auto == false)
		{
			price = area*1200;
		}
		else if(stnd == "above standard" && auto == false)
		{
			price = area*1500;
		}
		else if(stnd == "high standard" && auto == false)
		{
			price = area*1800;
		}
		else if(stnd == "high standard" && auto == true)
		{
			price = area*2500;
		}
		return price;
	}	
}