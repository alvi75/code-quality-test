import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = 0;
		for(i=0;i<end;i++){
			if(headerPart.charAt(i) == '\n'){
				return i;
			}
		}
		return -1;
	}
}