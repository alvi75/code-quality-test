import java.util.*;

public class Generated_6367670b1a6d9265ec017a05 {
    public static String toString(final char ch){
		if(ch == 0)
			return "0";
		else if(ch == '\n')
			return "\n";
		else if(ch == '\r')
			return "\r";
		else if(ch == '\"'){
			return "\"";
		}
		else if(ch == '\''){
			return "'";
		}
		else if(ch == '\\'){
			return "\\";
		}
		else{
			StringBuffer sb = new StringBuffer();
			sb.append(ch);
			return sb.toString();
		}
	}
}