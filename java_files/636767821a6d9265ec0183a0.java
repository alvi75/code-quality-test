import java.util.*;

public class Generated_636767821a6d9265ec0183a0 {
    protected static void deleteFile(String fileName){
		if(fileName != null && new File(fileName).exists()){
			try {
				new File(fileName).delete();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}