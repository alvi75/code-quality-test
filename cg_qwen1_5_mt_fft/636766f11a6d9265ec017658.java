import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        final int len = filename.length();
        for(int i=len;i>0;--i){
            if(filename.charAt(i-1) == '/')
                return i-1;
            if(!isWindowsDriveLetter(filename.substring(0,i))){
                //not a windows drive letter
                if(isPathSeparator(filename.charAt(i-1)))
                    return i-1;
            }
        }
        return -1;
    }
}