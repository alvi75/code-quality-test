import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath() {
        String path = System.getProperty("java.class.path");
        if (path == null) return new File[0];
        StringTokenizer st = new StringTokenizer(path, File.pathSeparator);
        ArrayList<File> files = new ArrayList<>();
        while(st.hasMoreTokens()){
            files.add(new File(st.nextToken()));
        }
        return files.toArray(new File[files.size()]);
    }
}