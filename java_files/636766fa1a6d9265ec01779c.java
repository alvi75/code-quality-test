import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    private String parseToken(final char[] terminators) {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            if (this.currentChar == -1) {
                break;
            }
            if (terminators != null && terminators.length > 0) {
                for (int i = 0; i < terminators.length; i++) {
                    if (this.currentChar == terminators[i]) {
                        this.nextChar();
                        return sb.toString();
                    }
                }
            }
            sb.append((char) this.currentChar);
            this.nextChar();
        }
        return sb.toString();
    }
}