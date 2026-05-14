import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.**/
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        int b0 = bb.get(i) & 0xFF;
        if ((b0 & 0x80) == 0)
            return i + 1;

        int b1 = bb.get(i+1) & 0xFF;
        if ((b0 & 0xE0) == 0xC0)
            return utf8Decode(b0,b1,sb);

        int b2 = bb.get(i+2) & 0xFF;
        if ((b0 & 0xF0) == 0xE0)
            return utf8Decode(b0,b1,b2,sb);

        int b3 = bb.get(i+3) & 0xFF;
        if ((b0 & 0xF8) == 0xF0)
            return utf8Decode(b0,b1,b2,b3,sb);
        
        throw new IllegalArgumentException("Invalid UTF-8 byte: " + Integer.toHexString(b0));
    }
}