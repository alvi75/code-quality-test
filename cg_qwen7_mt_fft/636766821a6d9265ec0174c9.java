import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
        String path = System.getProperty("java.class.path");
        String separator = System.getProperty("path.separator");
        StringTokenizer tokenizer = new StringTokenizer(path,separator);
        List<File> files = new ArrayList<File>();
        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            try {
                files.add(new File(token).getCanonicalFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return files.toArray(new File[files.size()]);
    }
}