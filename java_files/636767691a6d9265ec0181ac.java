import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
        if(path==null || relativePath==null) return null;
        int index = path.indexOf(FOLDER_SEPARATOR);
        if(index==-1) return null;
        return path.substring(0,index)+relativePath;
    }
}