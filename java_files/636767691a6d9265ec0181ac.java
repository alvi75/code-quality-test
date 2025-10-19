import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(path==null || relativePath==null)	return null;
		int idx = path.lastIndexOf(FOLDER_SEPARATOR);
		String folderPath = idx==-1 ? "" : path.substring(0,idx+1);	//get the parent directory
		return join(folderPath,relativePath);
	}
}