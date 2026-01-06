import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(relativePath==null||relativePath.length()==0)
			return path;
		int index=path.lastIndexOf(FOLDER_SEPARATOR);
		String newPath;
		if(index==-1){
			newPath=relativePath;
		}else{
			newPath=path.substring(0,index)+relativePath;
		}
		return newPath;
	}
}