import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename) {
        for (int i = filename.length(); i >= 0; --i) {
            char c = filename.charAt(i);
            switch(c) {
                case '.':
                    // Found a dot, check to see if this is part of a file name.
                    if (i > 0 && !isFileSep(filename.charAt(i-1))) {
                        return i;
                    }
                    break;

                default:
                    if (!Character.isLetterOrDigit(c)) {
                        return i;
                    }
                    break;
            }
        }

        return -1;
    }
}