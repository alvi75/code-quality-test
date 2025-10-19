import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    public static String[] split(String toSplit,String delimiter){
		int index = toSplit.indexOf(delimiter);
		if(index == -1) {
			return new String[]{toSplit};
		}
		
		String left = toSplit.substring(0,index);
		String right = toSplit.substring(index+delimiter.length());
		
		return new String[]{left,right};
	}
}