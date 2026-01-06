import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    /**Obtains the number corresponding to the character c.**/
    private static int digitValue(final char c){
        if(c >= '0' && c <= '9'){
            return c - '0';
        }
        if(c >= 'a' && c <= 'f'){
            return 10 + c - 'a';
        }
        if(c >= 'A' && c <= 'F'){
            return 10 + c - 'A';
        }
        throw new IllegalArgumentException("Invalid hex digit: " + c);
    }
}