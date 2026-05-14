import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
		String path = System.getProperty("java.class.path");
		if(path == null) return new File[0];
		
		String[] paths = path.split(File.pathSeparator);
		File[] files = new File[paths.length];
		for(int i=0; i<files.length; i++){
			files[i] = new File(paths[i]);
		}
		return files;
	}
}