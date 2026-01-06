import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    public static String applyRelativePath(String path,String relativePath){
        if(StringUtils.isBlank(path)){
            return relativePath;
        }
        int index = path.lastIndexOf(FOLDER_SEPARATOR);
        if(index == -1){
            return relativePath;
        }else{
            return path.substring(0,index) + relativePath;
        }
    }
}