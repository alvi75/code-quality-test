import java.util.*;

public class Generated_636767a61a6d9265ec0185b7 {
    /**Obtains the number corresponding to the character c.**/
    private static int digitValue(final char c){
        if(c >= '0' && c <= '9'){
            return (c - '0');
        }else{
            final int value = Character.digit(c, 16);
            if(value == -1){
                throw new IllegalArgumentException("Invalid hexadecimal: " + c);
            }
            return value;
        }
    }
}