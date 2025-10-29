import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    /**Creates an array of the file type based on all file names in java.class.path and returns the array.**/
    private static File[] classPath(){
        String[] files = System.getProperty("java.class.path").split(File.pathSeparator);
        List<File> list = new ArrayList<>();
        for (String f : files) {
            if (!f.isEmpty()) {
                list.add(new File(f));
            }
        }
        return list.toArray(new File[list.size()]);
    }
}