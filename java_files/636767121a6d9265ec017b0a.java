import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = 0;
		for(;i<end;i++){
			char c = headerPart.charAt(i);
			if(c == '\r' || c == '\n'){
				return i;
			}
		}
		return -1;
	}
}