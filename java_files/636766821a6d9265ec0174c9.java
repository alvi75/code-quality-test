import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    /**Creates an array of the file type based on all file names in java.class.path and returns the array.
@see #classPath()
@return An array of the files found in the classpath.
@since 1.0
*/
public static File[] classPath(){
File[] files = new File[filesInClassPath().length];
for (int i=0; i<files.length; i++){
files[i] = filesInClassPath()[i].getCanonicalFile();
}
return files;
}
}