import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class write {

	 //Write JSON file
	public void writeToFile(JSONObject obj, String name) {
		
		
	
		
		String FileName = "Z:\\eclipse-workspaceJava\\OutPutJSON\\JSON\\" + name + ".json";
		
	 try (FileWriter file = new FileWriter(FileName)) {
		 
         file.write(obj.toString());
         file.flush();

     } catch (IOException e) {
         e.printStackTrace();
     }
	
}
}
