import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class environmentConfig {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser obj = new JSONParser();
		FileReader fileReader = new FileReader(".//src/test/resources/properties/blackbird.json");
		Object obj1 =  obj.parse(fileReader);
		JSONObject obj2 = (JSONObject)obj1;
		
		System.out.println(obj2.get("name"));
		


	}

}
