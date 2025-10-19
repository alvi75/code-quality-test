import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
		int i = 0;
		for(i=end;i<end+headerPart.length();i++){
			if(headerPart.charAt(i)!=' ' && headerPart.charAt(i)!='\t' && headerPart.charAt(i)!='\r' && headerPart.charAt(i)!='\n')
				break;
		}
		return i-end;
	}
}