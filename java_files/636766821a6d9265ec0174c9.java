import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
        String cp = System.getProperty("java.class.path");
        StringTokenizer st = new StringTokenizer(cp,File.pathSeparator);
        List<File> fileList = new ArrayList<File>();
        while(st.hasMoreTokens()){
            fileList.add(new File(st.nextToken()));
        }
        return fileList.toArray(new File[fileList.size()]);
    }
}