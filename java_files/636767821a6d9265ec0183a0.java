import java.util.*;

public class Generated_636767821a6d9265ec0183a0 {
    /**Delete the given file if it exists**/
	protected static void deleteFile(String fileName){
		if (fileName != null && !fileName.isEmpty()){
			File file = new File(fileName);
			if (file.exists() && file.isFile()) {
				file.delete();
			}
		}
	}
}