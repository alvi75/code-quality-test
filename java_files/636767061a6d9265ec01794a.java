import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
        int i = filename.lastIndexOf('.');
        if(i == -1 || filename.indexOf(File.separatorChar, i) != -1)
            return -1;
        else
            return i;
    }
}