package assignment5;

public class TestMedicine {

	public static void main(String[] args) {
		 Medicine med;
		 
		 int num=(int)(Math.random()*(3-1))+1;
		 if(num == 1)
		 {
				med = new Tablet();
				med.price = 60;
				med.expiryDate = "10/2021";
				med.getDetails();
				med.displayLabel();				
		 }
		 
		 else if(num == 2)
		 {
				med = new Syrup();
				med.price = 140;
				med.expiryDate = "10/2022";
				med.getDetails();
				med.displayLabel();
		 }
		 
		 else if(num==3)
		 {
				med = new Ointment();
				med.price = 90;
				med.expiryDate = "10/2023";
				med.getDetails();
				med.displayLabel();
		 }
	}

}
