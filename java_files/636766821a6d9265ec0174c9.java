import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    /**Creates an array of the file type based on all file names in java.class.path and returns the array.**/
    private static File[] classPath(){
        String[] paths = System.getProperty("java.class.path").split(File.pathSeparator);
        List<File> files = new ArrayList<>();
        for (String path : paths){
            if (path.length() > 0 && !path.startsWith("file:")){
                try{
                    files.add(new File(path));
                }catch (Exception e){}
            }
        }
        return files.toArray(new File[files.size()]);
    }
}