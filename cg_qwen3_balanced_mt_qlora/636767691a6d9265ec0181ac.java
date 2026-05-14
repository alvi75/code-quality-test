import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    /**Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.**/
	public static String applyRelativePath(String path,String relativePath){
		if (relativePath == null) {
			return path;
		}
		int idx = path.lastIndexOf(FOLDER_SEPARATOR);
		String newPath = path.substring(0, idx + 1).concat(relativePath);
		return newPath;
	}
}