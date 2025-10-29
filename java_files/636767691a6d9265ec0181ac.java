import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    /**Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.*/
    public static String applyRelativePath(String path,String relativePath){
        if (relativePath==null||relativePath.length()==0) {
            return path;
        }
        if (path==null||path.length()==0) {
            return relativePath;
        }
        int index=path.lastIndexOf(FOLDER_SEPARATOR);
        if (index==-1) {
            return relativePath;
        }else{
            return path.substring(0,index)+FOLDER_SEPARATOR+relativePath;
        }
    }
}