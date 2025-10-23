import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
		int i = filename.lastIndexOf('.');
		if(i==-1 || (i>0 && filename.charAt(i-1)=='/'))return -1;
		return i;
	}
}