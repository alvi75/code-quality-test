import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i=0;
		while(i<end && (headerPart.charAt(i) == '\n' || headerPart.charAt(i) == '\r'))i++;
		if(headerPart.length() > 0 && i < end && headerPart.charAt(end-1) == '\r')return end-1;
		return end;
	}
}