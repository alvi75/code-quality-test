import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
		int i = filename.lastIndexOf('.');
		if (i > 0 && i < filename.length() - 1) {
			return i;
		}
		return -1;
	}
}