package assignment6;

public class TestAverage {

	public static void main(String[] args) {
		
             Averager average= new Averager();
             
             System.out.println(average.avg(5, 10));
             System.out.println(average.avg(5, 10, 15));
             System.out.println(average.avg(5.20, 12.80));
             
             
	}

}
