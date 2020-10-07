package assignment4;

public class MyUtil {

	public static double throwDice() {
		double randomNum;
		randomNum = (Math.random() * (6 - 1)) + 1; 
		return randomNum;
	}
	
	public static float average(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
		}
		
		float avg = (float)sum / arr.length;
		return avg;
	}
	
}
