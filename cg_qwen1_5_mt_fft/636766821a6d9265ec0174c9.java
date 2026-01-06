import java.util.*;

public class Generated_636766821a6d9265ec0174c9 {
    private static File[] classPath(){
		String path = System.getProperty("java.class.path");
		File files[] = new File[0];
		if (path != null){
			path = path.replace(File.pathSeparator, "/");
			files = new File[path.split("/").length];
			int i = 0;
			for(String f : path.split("/")){
				try{
					files[i++] = new File(f);
				}catch(Exception e){}
			}
		}
		return files;
	}
}