import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    public static boolean isAsciiControl(final char ch){
        return (ch >= 0x0 && ch <= 0x8) || 
                (ch >= 0xb && ch <= 0xc) ||
                (ch >= 0xe && ch <= 0x1f) ||
                (ch >= 0x7f && ch <= 0xa0);
    }
}