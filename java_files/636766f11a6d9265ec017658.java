import java.util.*;

public class Generated_636766f11a6d9265ec017658 {
    public static int indexOfLastSeparator(String filename){
		int unixIndex = filename.lastIndexOf('/');
		int winIndex = filename.lastIndexOf('\\');
		if(unixIndex==-1) return Math.max(0,winIndex);
		else if(winIndex==-1) return unixIndex;
		return Math.min(unixIndex,winIndex);
	}
}