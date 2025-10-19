import java.util.*;

public class Generated_636767121a6d9265ec017b0a {
    /**
 * Parse the header part starting from the given end position and return the index of the enter sequence.
 */
    private int parseEndOfLine(String headerPart,int end){
        for (int i = end; i < headerPart.length(); i++) {
            if(headerPart.charAt(i) == '\n'){
                return i;
            }
        }

        return -1;
    }
}