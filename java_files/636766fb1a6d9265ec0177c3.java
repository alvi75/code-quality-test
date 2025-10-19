import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch){
        final int i = (int)ch;
        return ((i>=0x21 && i<=0x7E) || (i>=0xa1 && i<=0xaf) || (i>=0xd1 && i<=0xdf) || (i>=0xe1 && i<=0xef) || (i>=0xf1 && i<=0xff));
    }
}