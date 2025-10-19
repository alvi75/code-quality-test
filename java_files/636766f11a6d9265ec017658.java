import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
        if(filename == null) return -1;
        for(int i=filename.length();i>0;--i)
            if('A'<=filename.charAt(i)&&filename.charAt(i)<='Z') return i;
        return 0;
    }
}