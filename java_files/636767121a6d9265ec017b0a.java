import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    private int parseEndOfLine(String headerPart,int end){
        //System.out.println("headerPart = "+headerPart);
        if(headerPart.charAt(end) == '\r' && (headerPart.charAt(++end) != '\n') || headerPart.charAt(end) == '\n')
            return end;
        else
            return -1;
    }
}