import java.util.*;

public class Generated_636767691a6d9265ec0181ac {
    /**
     * Combine the substring before FOLDER_SEPARATOR of the given path with the given relative path to construct a new full file path,and return the full file path.
     */
    public static String applyRelativePath(String path,String relativePath){
        if(path==null)return relativePath;
        int separatorIndex = path.indexOf(FOLDER_SEPARATOR);
        int relativeSeparatorIndex = relativePath.indexOf(FOLDER_SEPARATOR);
        if(separatorIndex==-1&&relativeSeparatorIndex==-1)
            return path+separator+relativePath;
        else if(relativeSeparatorIndex==-1)
            return path+separator+relativePath.substring(0,relativePath.lastIndexOf(FOLDER_SEPARATOR));
        else{
            int commonPathLength=0;
            while(commonPathLength<Math.min(path.length(),relativePath.length())&&path.charAt(commonPathLength)==relativePath.charAt(commonPathLength))
                ++commonPathLength;
            if(commonPathLength>0){
                StringBuffer result=new StringBuffer(path.substring(0,commonPathLength));
                result.append(separator).append(relativePath.substring(relativeSeparatorIndex));
                return result.toString();
            }
            else{
                return path+separator+relativePath;
            }
        }
    }
}