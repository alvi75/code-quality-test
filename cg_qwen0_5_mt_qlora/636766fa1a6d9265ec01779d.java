import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    /**Check whether the character is ASCII 7 bit control.**/
    public static boolean isAsciiControl(final char ch){
        return (ch >= 0x20 && ch <= 0x7e) || (ch >= 0xe0 && ch <= 0xff);
    }
}