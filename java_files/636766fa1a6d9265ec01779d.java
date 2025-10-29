import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    /**Check whether the character is ASCII 7 bit control.**/
    public static boolean isAsciiControl(final char ch) {
        if (ch < 0x20 || ch > 0x7E) return true;
        else return false;
    }
}