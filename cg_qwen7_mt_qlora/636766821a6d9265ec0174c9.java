import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    /**Creates an array of the file type based on all file names in java.class.path and returns the array.**/
    private static File[] classPath(){
        String path = System.getProperty("java.class.path");
        StringTokenizer st = new StringTokenizer(path, File.pathSeparator);
        List<File> list = new ArrayList<>();
        while (st.hasMoreTokens()){
            list.add(new File(st.nextToken()));
        }
        return list.toArray(new File[list.size()]);
    }
}