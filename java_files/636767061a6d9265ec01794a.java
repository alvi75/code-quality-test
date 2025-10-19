import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
		int index = filename.lastIndexOf(EXTENSION_SEPARATOR);
		if(index!=-1 && (index+1)<filename.length()){
			return index;
		}
		return -1;
	}
}