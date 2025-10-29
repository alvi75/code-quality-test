import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
        for(int i=end;i<headerPart.length();i++){
            if(headerPart.charAt(i) == '\n'){
                return i;
            }
        }
        throw new RuntimeException("No end of line found");
    }
}