import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = end;
		while(i>0 && headerPart.charAt(i) != '\n') --i;
		return i+1;
	}
}