import java.util.*;

public class Generated_636766fa1a6d9265ec01779c {
    /**Parses out a token until any of the given terminators is encountered and then return the token.
@param terminators The list of characters that terminate the token.
@return The token parsed from the input stream.
@throws IOException If there was a problem reading from the input stream.
@throws ParseException If there was a problem parsing the token.
*/
private String parseToken(final char[] terminators) throws IOException, ParseException {
        final StringBuilder sb = new StringBuilder();
        while (true){
            final int c = in.read();
            if (c == -1 || Character.isWhitespace((char)c)){
                break;
            }
            if (terminators != null && ArrayUtils.contains(terminators, (char)c)){
                break;
            }
            sb.append((char)c);
        }

        return sb.toString();
    }
}