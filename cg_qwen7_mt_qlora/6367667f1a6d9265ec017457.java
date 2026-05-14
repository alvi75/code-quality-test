import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.**/
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        if(bb.get(i) < 0x80)
            sb.append((char)(bb.get(i)));
        else{
            int c = bb.get(i);
            if(c >= 0xc2 && c <= 0xdf){
                //1 byte sequence
                sb.append((char)c);
            }else if(c == 0xe0){
                //3 bytes sequence
                int b1 = bb.get(++i);
                int b2 = bb.get(++i);
                if(b1 >= 0xa0 && b1 <= 0xbf && b2 >= 0x80 && b2 <= 0xbf){
                    sb.append((char)((c << 6) + (b1 << 0) + (b2 << -6)));
                }
            }else if(c == 0xed){
                //3 bytes sequence
                int b1 = bb.get(++i);
                int b2 = bb.get(++i);
                if(b1 >= 0x80 && b1 <= 0x9f && b2 >= 0x80 && b2 <= 0xbf){
                    sb.append((char)((c << 6) + (b1 << 0) + (b2 << -6)));
                }
            }else if(c == 0xf0){
                //4 bytes sequence
                int b1 = bb.get(++i);
                int b2 = bb.get(++i);
                int b3 = bb.get(++i);
                if(b1 >= 0x90 && b1 <= 0xbf && b2 >= 0x80 && b2 <= 0xbf && b3 >= 0x80 && b3 <= 0xbf){
                    sb.append((char)((c << 12) + (b1 << 6) + (b2 << 0) + (b3 << -12)));
                }
            }else if(c == 0xf4){
                //4 bytes sequence
                int b1 = bb.get(++i);
                int b2 = bb.get(++i);
                int b3 = bb.get(++i);
                if(b1 >= 0x80 && b1 <= 0x8f && b2
}