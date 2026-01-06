import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
        if(filename == null || filename.length() == 0) return -1;
        for(int i = filename.length()-1; i >= 0; i--){
            char c = filename.charAt(i);
            if(c == File.separatorChar) return i;
        }
        return -1;
    }
}