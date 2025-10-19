import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
		if(path==null || path.length()==0)
			return relativePath;
		else if(relativePath==null || relativePath.length()==0)
			return path;
		else{
			int index=path.indexOf(FOLDER_SEPARATOR);
			if(index==-1)
				return path+relativePath;
			else
				return path.substring(0,index)+relativePath;
		}
	}
}