import java.io.IOException;
import java.util.Scanner;

import org.json.simple.parser.ParseException;

public class StockAccountManagementMain {
	public static void main(String[] args) throws IOException, ParseException {
		StockReport report=new StockReport();
		System.out.print("Enter how many stock you want to insert - ");
		Scanner scanInput = new Scanner(System.in);
		int getUserInput = scanInput.nextInt();
		
		for(int i=0;i<getUserInput;i++) {
			report.insertStock();
		}
		
		report.readReport(getUserInput);
	}
}
