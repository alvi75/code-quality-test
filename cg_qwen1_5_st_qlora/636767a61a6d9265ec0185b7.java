import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    /**Obtains the number corresponding to the character c.*/
    private static int digitValue(final char c){
        if(c >= '0' && c <= '9') return c - '0';
        else if(c >= 'A' && c <= 'Z') return c - 'A' + 10;
        else if(c >= 'a' && c <= 'z') return c - 'a' + 10;
        else throw new IllegalArgumentException("Invalid character: " + c);
    }
}