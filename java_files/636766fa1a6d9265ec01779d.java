import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    public static boolean isAsciiControl(final char ch) {
        if (ch >= 0x00 && ch <= 0x1F) return true;
        if (ch >= 0x7F) return true;
        return false;
    }
}