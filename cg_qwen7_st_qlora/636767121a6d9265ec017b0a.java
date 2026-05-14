import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = end;
		while(i<headerPart.length()){
			char c = headerPart.charAt(i);
			if(c==CR||c==LF){
				return i;
			}
			i++;
		}
		throw new IllegalArgumentException("Invalid header format");
	}
}