import java.io.InputStream;



public class Handler {

	
	public static InputStream inputStreamFromFile(String path) {
		try {
			InputStream inputStream = Handler.class.getResourceAsStream(path);
			return inputStream;
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
}
