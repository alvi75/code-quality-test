import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch) {
        if (ch < 0 || ch > 255)
            throw new IllegalArgumentException("Invalid character: " + ch);
        return new Character(ch);
    }
}