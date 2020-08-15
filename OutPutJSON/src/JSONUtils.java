import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONObject;

public class JSONUtils {

	
	public static String getJSONStringFromFile(String path) {
		
		Scanner s;
		InputStream in = Handler.inputStreamFromFile(path);
		s = new Scanner(in);
		String json = s.useDelimiter("\\Z").next();
		s.close();
	
		return json;
	}
	
	public static JSONObject getJSONObjectFromFile(String path) {
		
		return new JSONObject(getJSONStringFromFile(path));
	}

	
	public static boolean objectExists(JSONObject jsonObject, String path) {
		Object o;
		try {
			o = jsonObject.get("key");
		}catch(Exception e) {
			return false;
		}
		
		return o != null;
		
	}
	
}
