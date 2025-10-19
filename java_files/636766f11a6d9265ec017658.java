import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
		int i = filename.lastIndexOf('/');
		if(i==-1)
			i=filename.lastIndexOf('\\');
		return i;
	}
}