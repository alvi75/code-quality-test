import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    /**Return the last index of the extension separator in the given filename,it will return -1 if the filename doesn't have the separator or there is a directory separator after it.*/
    public static int indexOfExtension(String filename){
        int dot = filename.lastIndexOf('.');
        if(dot==-1 || filename.indexOf(File.separatorChar)>=dot)
            return -1;
        else
            return dot;
    }
}