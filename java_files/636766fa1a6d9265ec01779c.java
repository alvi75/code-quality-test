import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    /**Parses out a token until any of the given terminators is encountered and then return the token.**/
    private String parseToken(final char[] terminators){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < terminators.length) {
            if (terminators[i] == -1) {
                break;
            }
            sb.append(terminators[i]);
            i++;
        }
        return sb.toString();
    }
}