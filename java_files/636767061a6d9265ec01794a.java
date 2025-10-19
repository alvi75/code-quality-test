import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
        String[] exts = getExtensions();
        for (int i = exts.length-1; i >= 0; i--) {
            if(filename.endsWith(exts[i])) return exts[i];
        }
        return -1;
    }
}