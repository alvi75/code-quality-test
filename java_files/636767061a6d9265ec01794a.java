import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    /**Return the last index of the extension separator in the given filename,it will return -1 if the filename doesn't have the separator or there is a directory separator after it.**/ 
    public static int indexOfExtension(String filename){
        String[] path = StringUtils.split(filename, '/');
        for (int i = 0; i < path.length; i++) {
            if (StringUtils.hasText(path[i]) && path[i].endsWith(".")) {
                return i;
            }
        }
        return -1;
    }
}