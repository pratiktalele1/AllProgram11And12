package Utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class utilityForCompanySharesLinkList {
	public static String getShareName() {
		System.out.print("Enter share name - ");
		Scanner scanInput1 = new Scanner(System.in);
		String getUserInput2 = scanInput1.next();
		return getUserInput2;
		
	}
	
	public static int addShare() {
		System.out.print("Enter share value- ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		return getUserInput;
	}
	
	public static String action() {
		System.out.print("action- ");
		Scanner scanInput = new Scanner(System.in);
		String getUserInput = scanInput.next();
		return getUserInput;
	}
	public static String dateTime() {
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		  Calendar cal = Calendar.getInstance();
		  return dateFormat.format(cal.getTime());
	}
}
