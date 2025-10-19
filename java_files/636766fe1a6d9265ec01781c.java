import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch){
        if (ch < 0x10000) {
            return new Character(ch);
        } else {
            final int hi = ((int)ch >> 16) & 0xFFFF;
            final int lo = (int)ch & 0xFFFF;
            return new Character((char)(hi << 16 | lo));
        }
    }
}