import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
        if(path==null)
            throw new NullPointerException("path is null");
        if(relativePath==null)
            throw new NullPointerException("relativePath is null");
        if(path.endsWith(FOLDER_SEPARATOR))
            path=path.substring(0,path.length()-1);
        if(relativePath.startsWith(FOLDER_SEPARATOR))
            relativePath=relativePath.substring(1);
        return path+FOLDER_SEPARATOR+relativePath;
    }
}