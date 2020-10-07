package assignment4;

public class TestMyUtil {

	public static void main(String[] args) {
		
		MyUtil myutil = new MyUtil();
		System.out.println(myutil.throwDice());
		
		int arr1[] = {1,3,5,7,9};
		int arr2[] = {2,4,6,8,10};
		
		System.out.println(myutil.average(arr1));
		System.out.println(myutil.average(arr2));
		System.out.println(Math.max(10, 3));
		System.out.println(Math.min(4, 11));
		
		double randomNum = myutil.throwDice();
		System.out.println(Math.ceil(randomNum));
		System.out.println(Math.floor(randomNum));
		System.out.println(Math.round(randomNum));

	}

}
