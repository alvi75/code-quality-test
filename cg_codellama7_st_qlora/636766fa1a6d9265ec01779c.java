import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
        final StringBuilder token = new StringBuilder();
        char c;
        while((c = next()) != EOF){
            if(Arrays.binarySearch(terminators, c) >= 0){
                break;
            }
            token.append(c);
        }
        return token.toString();
    }
}