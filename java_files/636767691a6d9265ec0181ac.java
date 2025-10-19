import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(path==null || path.length()==0){
			return relativePath;
		}
		int index = path.lastIndexOf(FOLDER_SEPARATOR);
		if(index==-1){
			return relativePath;
		}
		String prefix=path.substring(0,index);
		String suffix=path.substring(index+1);
		return prefix+relativePath;
	}
}