import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
        int index = filename.lastIndexOf(File.separatorChar);
        if(index == -1)
            index = filename.lastIndexOf('/');
        return index;
    }
}