import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
		int index = -1;
		if(filename != null && !filename.isEmpty()){
			index = Math.max(filename.lastIndexOf(File.separatorChar), filename.lastIndexOf('/'));
		}
		return index;
	}
}