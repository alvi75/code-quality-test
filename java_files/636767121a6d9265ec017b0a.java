import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = 0;
		while(i < end && !headerPart.charAt(end - i) == '\n'){
			i++;
		}
		return end - i;
	}
}