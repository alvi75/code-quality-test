import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath() {
        String[] path = System.getProperty("java.class.path").split(File.pathSeparator);
        List<File> files = new ArrayList<>();
        for (String s : path) {
            if (!s.isEmpty()) {
                try {
                    files.add(new File(s));
                } catch (Exception e) {
                    // ignore
                }
            }
        }
        return files.toArray(new File[files.size()]);
    }
}