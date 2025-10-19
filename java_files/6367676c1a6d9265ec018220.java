import java.util.*;

public class Generated_6367676c1a6d9265ec018220 {
    public static String stripFilenameExtension(String path){
		int index = path.lastIndexOf('.');
		if(index == -1)
			return path;
		else
			return path.substring(0, index);
	}
}