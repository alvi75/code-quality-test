import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.
@throws IllegalArgumentException if the input is not a valid UTF-8 sequence.
@see #decodeOctet(int)
*/
private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        try {
            String s = new String(bb.array(),i,i+3,"UTF-8");
            sb.append(s);
            return i + 3;
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException("UTF-8 encoding not supported",e);
        }
    }
}