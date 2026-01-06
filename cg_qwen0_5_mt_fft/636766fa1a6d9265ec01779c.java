import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators){
        final StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < terminators.length; i++) {
            if (terminators[i] == input.charAt(i)) {
                break;
            }
        }

        while (i < input.length) {
            if (terminators[i] != '\n') {
                result.append(input.charAt(i));
            } else {
                break;
            }
        }

        return result.toString();
    }
}