package exceptionhandling;

import java.time.*;
import java.text.*;
import java.util.*;

public class AgeCalculator1 
{
   public int calculateAge(String DOB)  throws ParseException
   {
	    Date date = new SimpleDateFormat("dd/mm/yyyy").parse(DOB);
		LocalDate birthday = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthday, today);
		return period.getYears();
   }


}
