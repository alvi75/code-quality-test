import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    /**Parse the header part starting from the given end position and return the index of the enter sequence.**/
	private int parseEndOfLine(String headerPart,int end){
		int i = end;
		while(i>0 && headerPart.charAt(i-1)!='\n'){
			i--;
		}
		return i;
	}
}