import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    /**Return the Character object converted from the given character.**/ 
    public static Character toCharacterObject(final char ch){
        if (ch < 0x20 || ch > 0x7e) {
            throw new IllegalArgumentException("Illegal code point " + Integer.toHexString(ch));
        }
        return new Character(ch);
    }
}