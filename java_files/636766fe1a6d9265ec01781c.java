import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch)
    {
        if (ch < 0x10000) { return new Character(ch); }
        else if (ch > 0x10ffff) { throw new IllegalArgumentException("The character (" + ch + ") is not in the valid range."); }
        else { throw new IllegalArgumentException("This method does not support characters above U+10FFFF.");
        }
    }
}