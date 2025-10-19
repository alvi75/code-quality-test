import java.util.*;

public class Generated_636766fe1a6d9265ec01781c {
    public static Character toCharacterObject(final char ch){
        if (ch >= 0 && ch <= 127) {
            return new Character(ch);
        } else {
            throw new IllegalArgumentException("Invalid character: " + ch);
        }
    }
}