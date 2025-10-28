import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename) {
        int index = filename.lastIndexOf('.');
        if (index == -1 || index == filename.length() - 1)
            return -1;
        else
            return index;
    }
}