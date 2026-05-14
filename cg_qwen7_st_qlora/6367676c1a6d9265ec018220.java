import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    public static String stripFilenameExtension(String path){
		int dotIndex = path.lastIndexOf('.');
		if(dotIndex == -1) return path;
		return path.substring(0, dotIndex);
	}
}