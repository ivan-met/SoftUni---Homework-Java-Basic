import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;


public class _07DaysBetweenTwoDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstDate = correnctDateInput(scan.nextLine());
		String secondDate = correnctDateInput(scan.nextLine());
		Date startDate = new Date(firstDate);
		Date endDate = new Date(secondDate);
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		start.setTime(startDate);
		end.setTime(endDate);
		System.out.println(daysBetween(start, end));
		
		
	

	}
	public static long daysBetween(Calendar startDate, Calendar endDate) {
		long betweenDays = 0;
		//Calendar date = (Calendar)startDate.clone();
		while (startDate.before(endDate)) {
			startDate.add(Calendar.DAY_OF_MONTH,1);
			betweenDays++;
			
		}
		return betweenDays;
	}
	public static String correnctDateInput(String str) {
		
		if (str.length() < 10) {
			str = "0" + str;
		}
		String[] correctInput = str.split("-");
		str = correctInput[2] + "/" + correctInput[1] + "/" + correctInput[0];
		return str;
	}

}
