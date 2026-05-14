import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    /**Encoding the given string by changing '{' and '}' to the specified character for each,return the string after encoding.**/
	public static String encodeTemplateNames(String s){
		if(s == null || s.length() == 0) return "";
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c == '{'){
				sb.append('[');
			}else if(c == '}'){
				sb.append(']');
			}else{
				sb.append(c);
			}
		}
		return sb.toString();
	}
}