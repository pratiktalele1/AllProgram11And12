import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockReport {
	JSONObject completeRecord = new JSONObject();
	ArrayList<String> arrayList=new ArrayList<String>();

	
	public void readReport(int getInput) throws FileNotFoundException, IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		JSONObject jsonObject = (JSONObject) jsonParser.parse(new FileReader("./src/stockReport.json"));
		
		for (int i = 0; i<getInput; i++) {
			JSONArray array=(JSONArray) jsonObject.get(arrayList.get(i));
			JSONObject object=(JSONObject) array.get(i);
			System.out.println(object.get("no"));
		}
	}

	public void insertStock() throws IOException, ParseException {

		JSONObject jsonObject = new JSONObject();
		System.out.print("Enter name- ");
		Scanner scanInput1 = new Scanner(System.in);
		String getShareName = scanInput1.next();

		System.out.print("Enter no of share- ");
		Scanner scanInput2 = new Scanner(System.in);
		int getNoOfShare = scanInput2.nextInt();

		System.out.print("Enter price of share- ");
		Scanner scanInput3 = new Scanner(System.in);
		int getPriceOfShare = scanInput3.nextInt();

		
		jsonObject.put("name", getShareName);
		arrayList.add(getShareName);
		jsonObject.put("no", getNoOfShare);
		jsonObject.put("price", getPriceOfShare);
		

		JSONArray insert = new JSONArray();
		insert.add(jsonObject);

		completeRecord.put(getShareName, insert);

		FileWriter fw = new FileWriter("./src/stockReport.json");
		fw.write(completeRecord.toJSONString());
		fw.flush();
		fw.close();
		
	}
}
