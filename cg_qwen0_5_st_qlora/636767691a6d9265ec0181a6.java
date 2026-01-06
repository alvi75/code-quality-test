import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    public static String[] split(String toSplit,String delimiter){
		String[] result = new String[2];
		int index = toSplit.indexOf(delimiter);
		if(index != -1){
			result[0] = toSplit.substring(0,index);
			result[1] = toSplit.substring(index+delimiter.length());
		}
		else{
			result[0] = toSplit;
			result[1] = "";
		}
		return result;
	}
}