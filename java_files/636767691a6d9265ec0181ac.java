import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    /**
 * Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.
 */
    public static String applyRelativePath(String path,String relativePath){
        if(path==null)return null;
        int separatorIndex=path.lastIndexOf(FOLDER_SEPARATOR);
        if(separatorIndex<0)separatorIndex=0;

        //strip out absolute path
        if(relativePath.startsWith("/"))relativePath=relativePath.substring(1);

        String result=FOLDER_SEPARATOR+path.substring(0,separatorIndex)+FOLDER_SEPARATOR+relativePath;

        if(result.endsWith(FOLDER_SEPARATOR))result=result.substring(0,result.length()-1); //remove trailing slash

        return result;
    }
}