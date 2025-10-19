import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i=headerPart.length()-1;
		while(i>=end && !Character.isWhitespace(headerPart.charAt(i))){
			i--;
		}
		return i+1;
	}
}