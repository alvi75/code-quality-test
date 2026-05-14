import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    /**Return the path without the extension.**/
	public static String stripFilenameExtension(String path){
		int extIndex = path.lastIndexOf('.');
		if (extIndex == -1) {
			return path;
		}
		return path.substring(0, extIndex);
	}
}