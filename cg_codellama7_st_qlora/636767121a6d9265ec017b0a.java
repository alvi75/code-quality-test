import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int index=headerPart.indexOf(CRLF,end);
		if(index==-1){
			throw new IllegalArgumentException("Invalid header: "+headerPart);
		}
		return index;
	}
}