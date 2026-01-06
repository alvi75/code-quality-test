import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = end;
		while(i < headerPart.length() && !Character.isWhitespace(headerPart.charAt(i))){
			i++;
		}
		if(i == end){
			return -1;
		}
		else{
			return i;
		}
	}
}