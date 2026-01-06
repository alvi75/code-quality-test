import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(path.endsWith(FOLDER_SEPARATOR)){
			path = path.substring(0,path.length()-1);
		}
		return path + relativePath;
	}
}