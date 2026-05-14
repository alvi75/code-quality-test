import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
        if(filename == null || filename.indexOf('/') != -1) {
            return -1;
        }
        int dotIndex = filename.lastIndexOf('.');
        int pathIndex = filename.lastIndexOf('/');
        return (dotIndex > pathIndex) ? dotIndex : -1;
    }
}