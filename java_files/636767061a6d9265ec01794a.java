import java.util.*;

public class Generated_636767061a6d9265ec01794a {
    public static int indexOfExtension(String filename){
		int pos = filename.lastIndexOf('.');
		if(pos==-1) return -1;
		if(pos>0 && filename.charAt(pos-1)=='\\')return -1;
		return pos;
	}
}