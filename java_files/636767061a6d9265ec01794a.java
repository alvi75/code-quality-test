import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename) {int i = filename.lastIndexOf(File.separatorChar);if (i == -1) {return -1;} else {i++;while (i < filename.length() && !isExtension(filename, i)) {i++;}}return i;}
}