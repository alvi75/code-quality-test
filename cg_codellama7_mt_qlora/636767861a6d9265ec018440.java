import java.util.*;

public class Generated_636767861a6d9265ec018440 {
    public void abbreviate(int nameStart, StringBuffer buf) {
        int count = 0;
        int index = nameStart;
        while (index < buf.length()) {
            if (buf.charAt(index) == '.') {
                count++;
                if (count == 2) {
                    buf.delete(nameStart, index);
                    break;
                }
            }
            index++;
        }
    }
}