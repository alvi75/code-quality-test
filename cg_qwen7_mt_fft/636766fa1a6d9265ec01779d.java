import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    public static boolean isAsciiControl(final char ch) {
        if (ch < 32 || ch > 126)
            return true;
        else if (ch == 0x0e || ch == 0x0f)
            return true;
        else
            return false;
    }
}