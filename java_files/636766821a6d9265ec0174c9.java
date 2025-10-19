import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    /**
	 * Creates an array of the file type based on all file names in java.class.path and returns the array.
	 **/
	private static File[] classPath(){
		String[] cp = System.getProperty("java.class.path").split(File.pathSeparator);
		File[] files = new File[cp.length];
		for(int i=0;i<files.length;i++){
			files[i] = new File(cp[i]);
		}
		return files;
	}
}