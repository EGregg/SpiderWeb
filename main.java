//A spider is trying to build a web for itself. It doubles the work done everyday.
//
//If the spider completely built the web in 15 days, how many days did it take for the spider to build 25% of the web?


public class main {

	public static void main(String[] args) {
		final int finalDay = 15;
//		System.out.println(finalDay);
		double dailyWeb = 1;
//		System.out.println(dailyWeb);
		int initialDay = 0;
//		System.out.println(initialDay);
		{
			while (initialDay < finalDay){
				dailyWeb *= 2; // multiply dailyWeb by 2 each iteration, doubles it
							// every
							// "initialDay"
				++initialDay;
				System.out.println("On initialDay " + initialDay + " you have " + dailyWeb + " web made!");
			}
			System.out.println("Final web is " + dailyWeb);
			System.out.println("25% of this web would be " + dailyWeb*.25);
		}
	}
}