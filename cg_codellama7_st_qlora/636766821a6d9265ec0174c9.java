import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
		String[] classPath = System.getProperty("java.class.path").split(File.pathSeparator);
		File[] files = new File[classPath.length];
		for(int i = 0; i < classPath.length; i++){
			files[i] = new File(classPath[i]);
		}
		return files;
	}
}