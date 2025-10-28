import java.util.*;

public class Generated_636767691a6d9265ec0181a6 {
    public static String[] split(String toSplit,String delimiter){
		String[] result = new String[2];
		int index = 0;
		while(index < toSplit.length()){
			index = toSplit.indexOf(delimiter,index);
			if(index == -1) break;
			result[0] = toSplit.substring(0,index);
			result[1] = toSplit.substring(index+delimiter.length());
			index += delimiter.length();
		}
		return result;
	}
}