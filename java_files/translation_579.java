import java.util.*;

public class Translationtranslation_579 {
    public boolean handles(String commandLine) {
        int length = commandLine.length();
        if (length < 1 || length > 128) {
            return false;
        }
        for (int i = 0;
        i < length;
        i++) {
            char c = commandLine.charAt(i);
            switch(c) {
                case ' ':return true;
                default:break;
            }
        }
        return false;
    }
}