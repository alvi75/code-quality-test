import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename) {
        if (filename == null || filename.length() == 0)
            return -1;
        char[] path = new char[filename.length()];
        for (int i=filename.length()-1; i>=0; i--) {
            switch(filename.charAt(i)) {
                case '/':
                case '\\': 
                    return i;
            }
        }
        return -1;
    }
}