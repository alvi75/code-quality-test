import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.**/
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        int b = bb.get(i) & 0xFF;
        if(b < 128)
            sb.append((char)b);
        else if(b >= 192 && b <= 223)
            sb.append((char)(((b & 0x1F) << 6) | (bb.get(++i) & 0x3F)));
        else if(b >= 224 && b <= 239)
            sb.append((char)(((b & 0x0F) << 12) | ((bb.get(++i) & 0x3F) << 6) | (bb.get(++i) & 0x3F)));
        else if(b >= 240 && b <= 247)
            sb.append((char)(((b & 0x07) << 18) | ((bb.get(++i) & 0x3F) << 12) | ((bb.get(++i) & 0x3F) << 6) | (bb.get(++i) & 0x3F)));
        else
            throw new IllegalArgumentException("Invalid UTF-8 encoding.");
        return i + 1;
    }
}