import org.json.JSONObject;

public class add {

	
	
	public void addString(JSONObject obj, String key, String value) {
		obj.put(key, value);
	}
	public void addInt(JSONObject obj, String key, int value) {
		obj.put(key, value);
	}
	public void addDouble(JSONObject obj, String key, double value) {
		obj.put(key, value);
	}
	public void addBool(JSONObject obj, String key, boolean value) {
		obj.put(key, value);
	}
}
