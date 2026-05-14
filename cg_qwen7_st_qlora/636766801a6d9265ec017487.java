import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s){
		if(s==null||s.length()==0) return s;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			switch(c){
				case '{':sb.append('{');break;
				case '}':sb.append('}');break;
				default: sb.append(c); break;
			}
		}
		return sb.toString();
	}
}