import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
		int index = filename.lastIndexOf(EXTENSION_SEPARATOR);
		if(index == -1)
			return -1;
		if(index == filename.length() - 1)
			return -1;
		if(filename.charAt(index + 1) == DIR_SEPARATOR)
			return -1;
		return index;
	}
}