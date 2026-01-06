import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
        if(i==0) return 1;
        if(i==1) {
            sb.append((char)(bb.get() & 0xff));
            return 2;
        }
        if(i==2) {
            byte b = bb.get();
            if(b>=0) {
                sb.append((char)(b & 0xff));
                return 3;
            } else {
                int c = ((b & 0x1f) << 6) | (bb.get() & 0x3f);
                if(c>=0x80 && c<=0xbf) {
                    sb.append((char)c);
                    return 4;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
        }
        if(i==3) {
            byte b = bb.get();
            if(b>=0) {
                sb.append((char)(b & 0xff));
                return 4;
            } else {
                int c = ((b & 0xf) << 12) | ((bb.get() & 0x3f) << 6) | (bb.get() & 0x3f);
                if(c>=0x80 && c<=0xbf) {
                    sb.append((char)c);
                    return 5;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
        }
        if(i==4) {
            byte b = bb.get();
            if(b>=0) {
                sb.append((char)(b & 0xff));
                return 5;
            } else {
                int c = ((b & 0x7) << 18) | ((bb.get() & 0x3f) << 12) | ((bb.get() & 0x3f) << 6) | (bb.get() & 0x3f);
                if(c>=0x80 && c<=0xbf) {
                    sb.append((char)c);
                    return 6;
                } else {
                    throw new IllegalArgumentException("Invalid UTF-8");
                }
            }
        }
        throw new IllegalArgumentException("Invalid UTF-8");
    }
}