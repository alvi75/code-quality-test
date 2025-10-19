import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		int index = path.lastIndexOf(FOLDER_SEPARATOR);
		String folderName = (index==-1)?path: path.substring(0, index);
		return folderName+relativePath;
	}
}