package assignment6;

public class Averager {

	
	public static double avg(int a, int b)
	{
		int sum=a+b;
		double avrg= (double)sum/2;
		return avrg;
	}
	
	public static double avg(int a, int b, int c)
	{
		int sum=a+b+c;
		double avrg=(double)sum/3;
		return avrg;
	}
	
	public static double avg(double a, double b)
	{
		double sum=a+b;
		double avrg=sum/2;
		return avrg;
	}
}
