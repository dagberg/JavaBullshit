public class PetDriver
{

	public static void main(String[] args)
	{
		Pet stacy = new Pet("Stacy", 10, 10);
		Pet jackie = new Pet("Jackie", 10, 1);
		Pet rudy = new Pet("Rudy", 1, 10);
		Pet george = new Pet("George", 50, 10);
		Pet mort = new Pet("Mort", 10, 100);
		String smallest;
		String largest;
		String oldest;
		String youngest;
		int avgweight;
		int avgage;
		int totalweight;
		int totalage;
		Pet[] allfive = new Pet[5];
		allfive[0] = stacy;
		allfive[1] = jackie;
		allfive[2] = rudy;
		allfive[3] = george;
		allfive[4] = mort;
		int bigweight = stacy.getWeight();
		int littleweight = stacy.getWeight();
		int old = stacy.getAge();
		int young = stacy.getAge();
		
		for(int x = 0; x < 5; x++)
		{
			if(allFive[x].getWeight() > bigweight)
			{
				bigweight = allFive[x];
				largest = allFive[x].getName();
			}
			if(allFive[x].getWeight() < littleweight)
			{
				littleweight = allFive[x];
				smallest = allFive[x].getName();
			}
			if(allFive[x].getAge() < young)
			{
				young = allFive[x];
				youngest = allFive[x].getName();
			}
			if(allFive[x].getAge() > old)
			{
				old = allFive[x];
				oldest = allFive[x].getName();
			}
			totalweight = totalweight + allFive[x].getWeight();
			totalage = totalage + allFive[x].getAge()
			
		}
		
		avgweight = totalweight /5;
		avgage = totalage / 5;
		
		System.out.println("The oldest is " + oldest);
		System.out.println("The youngest is " + youngest);
		System.out.println("The heaviest is " + largest);
		System.out.println("The lightest is " + smallest);
		System.out.println("The average age is " + avgage);
		System.out.println("The average weight is " + avgweight);
	}
}
