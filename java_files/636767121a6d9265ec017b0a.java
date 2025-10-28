import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
        int pos = end;
        while(pos >= 0 && headerPart.charAt(pos) != '\n'){
            pos--;
        }
        return pos+1;
    }
}